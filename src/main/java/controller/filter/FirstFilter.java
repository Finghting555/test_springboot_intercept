package controller.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author jiale.zhang
 * @date 2019/3/11 7:33 PM
 */
@Slf4j
public class FirstFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("[{}]执行{}方法：Before！", this.getClass().getSimpleName(), "doFilter");
        //执行下一个filter
        filterChain.doFilter(servletRequest, servletResponse);
        log.info("[{}]执行{}方法：After！", this.getClass().getSimpleName(), "doFilter");
    }
}
