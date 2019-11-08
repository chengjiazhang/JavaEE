package com.banyuan.pangu.util.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author: ZCJ
 * @Date: 2019-11-02 12:22
 * @Description:
 */
public class PlatformFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("PlatformFilter===");
        //filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
