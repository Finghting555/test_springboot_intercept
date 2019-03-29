package controller.config;

import controller.interceptor.FirstInterceptor;
import controller.interceptor.SecondInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author jiale.zhang
 * @date 2019/3/11 7:53 PM
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new FirstInterceptor())
                .addPathPatterns("/**")
                .order(1);//指定执行顺序，数值越小越优先
        registry.addInterceptor(new SecondInterceptor())
                .addPathPatterns("/hello")
                .order(2);//指定执行顺序，数值越小越优先
    }
}
