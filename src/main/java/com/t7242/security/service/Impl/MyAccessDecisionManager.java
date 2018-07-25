package com.t7242.security.service.Impl;

import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Iterator;

@Service
public class MyAccessDecisionManager  implements AccessDecisionManager {


    @Override
    public void decide(Authentication authentication, Object object, Collection<ConfigAttribute> configAttributes) throws AccessDeniedException, InsufficientAuthenticationException {
        if(null==configAttributes||configAttributes.size()<=0){
            return;
        }
        ConfigAttribute configAttribute;
        String needRole;
        for(Iterator<ConfigAttribute> iter=configAttributes.iterator();iter.hasNext();){
            configAttribute=iter.next();
            needRole=configAttribute.getAttribute();
            for(GrantedAuthority ga:authentication.getAuthorities()){
                if(needRole.trim().equals(ga.getAuthority())){
                    return;
                }
            }
        }
        throw new AccessDeniedException("not right");
    }

    @Override
    public boolean supports(ConfigAttribute configAttribute) {
        return false;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }
}