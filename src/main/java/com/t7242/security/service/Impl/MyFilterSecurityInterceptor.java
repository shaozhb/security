package com.t7242.security.service.Impl;
import javax.servlet.*;

import org.springframework.security.access.SecurityMetadataSource;
import org.springframework.security.access.intercept.AbstractSecurityInterceptor;
import org.springframework.stereotype.Service;

import java.io.IOException;


@Service
public class MyFilterSecurityInterceptor extends AbstractSecurityInterceptor implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

    }

    @Override
    public void destroy() {

    }

    @Override
    public Class<?> getSecureObjectClass() {
        return null;
    }

    @Override
    public SecurityMetadataSource obtainSecurityMetadataSource() {
        return null;
    }
}
