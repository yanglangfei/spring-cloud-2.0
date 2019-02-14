package com.yanglf.albaba.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;
import com.yanglf.albaba.dubbo.service.HelloService;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author yanglf
 * @description
 * @since 2019/2/14
 **/
@Service(version = "${provider.service.version}")
public class HelloServiceImpl implements HelloService {

    @Value("${provider.service.name}")
    private String serviceName;

    @Override
    public String salHello(String name) {
        RpcContext rpcContext = RpcContext.getContext();
        return String.format("Service [name :%s , port : %d] %s(\"%s\") : Hello,%s",
                serviceName,
                rpcContext.getLocalPort(),
                rpcContext.getMethodName(),
                name,
                name);
    }
}
