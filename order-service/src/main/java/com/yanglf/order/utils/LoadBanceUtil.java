package com.yanglf.order.utils;

import com.netflix.appinfo.InstanceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yanglf
 * @sine 2019.01.07
 * @descriptipon
 * @see
 */
@Component
public class LoadBanceUtil {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 请求数
     */
    private Map<String, Integer> reqMap = new HashMap<>();


    public String getService(String serviceName,String path) {
        String instances = getInstances(serviceName);
        return restTemplate.getForObject(instances + path, String.class);
    }

    private String getInstances(String serviceName) {
        List<ServiceInstance> instances = discoveryClient.getInstances(serviceName);
        if (instances == null || instances.size() <= 0) {
            // 抛出服务不可用异常
            return null;
        }
        int serviceNum = instances.size();
        int reqNum = reqMap.get(serviceName);
        int serviceIndex = reqNum % serviceNum;
        reqNum++;
        reqMap.put(serviceName, reqNum);
        String serviceUri = instances.get(serviceIndex).getUri().toString();
        return "http://" + serviceUri + "/";
    }



    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }


}
