package util.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author: ZCJ
 * @Date: 2019-11-02 12:22
 * @Description:
 */
public class AuthFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Authinit=====");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("dofilter===");
    }

    @Override
    public void destroy() {
        System.out.println("Authdestroy====");
    }
}
