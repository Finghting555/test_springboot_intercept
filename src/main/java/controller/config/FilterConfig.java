package controller.config;

import controller.filter.FirstFilter;
import controller.filter.SecondFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jiale.zhang
 * @date 2019/3/11 7:41 PM
 */
@Configuration
public class FilterConfig {
    /**
     * 注册第一个过滤器
     * @return
     */
    @Bean
    public FilterRegistrationBean firstFilter() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean(new FirstFilter());
        //可不设置，默认过滤路径即为：/*
        registrationBean.addUrlPatterns("/*");
        registrationBean.setOrder(1);
        return registrationBean;
    }

    /**
     * 注册第二个过滤器
     * @return
     */
    @Bean
    public FilterRegistrationBean secondFilter() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean(new SecondFilter());
        //可不设置，默认过滤路径即为：/*
        registrationBean.addUrlPatterns("/*");
        registrationBean.setOrder(2);
        return registrationBean;
    }


}
