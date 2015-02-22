package org.spring.mvc.poc.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author luis mora
 */
public class MySecondCustomFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("MySecondCustomFilter.init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("MySecondCustomFilter.doFilter");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("MySecondCustomFilter.destroy");
    }
}
