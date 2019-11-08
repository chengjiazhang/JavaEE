package com.banyuan.pangu.util.filter;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author: ZCJ
 * @Date: 2019-11-02 12:22
 * @Description:
 */
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("login filter===");
        HttpServletRequest httpServletRequest=(HttpServletRequest)servletRequest;
        System.out.println("login==="+httpServletRequest.getRequestURI());

        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
