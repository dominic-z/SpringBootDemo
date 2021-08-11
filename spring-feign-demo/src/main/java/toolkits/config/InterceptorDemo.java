package toolkits.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;

/**
 * @author dominiczhu
 * @version 1.0
 * @title InterceptorDemo
 * @date 2021/8/11 上午11:05
 */
public class InterceptorDemo implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header("header-test","test");
    }
}
