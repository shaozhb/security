package com.t7242.security.service.Impl;

import com.t7242.security.mapper.PermissionMapper;
import com.t7242.security.model.Permission;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.HashMap;

@Service
public class MyInvocationSecurityMetadataSourceService implements FilterInvocationSecurityMetadataSource {
    @Resource
    private PermissionMapper permissionMapper;

    private HashMap<String,Collection<ConfigAttribute>> map=null;


    @Override
    public Collection<ConfigAttribute> getAttributes(Object o) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }
}
