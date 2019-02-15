package com.yanglf.order.interceptor;

import com.yanglf.order.utils.HttpUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author yanglf
 * @description
 * @since 2019/2/15
 **/
@Slf4j
public class RequestInterceptor implements HandlerInterceptor{

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info(String.format("RequestIp:%s---------RequestParam:%s-----RequestHeaders:%s",
                HttpUtils.getClientIp(request),
                HttpUtils.getRequestParams(request),
                HttpUtils.getRequestHeaders(request)
                ));
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
