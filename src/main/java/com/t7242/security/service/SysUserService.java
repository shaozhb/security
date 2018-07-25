package com.t7242.security.service;

import com.t7242.security.model.SysUser;

public interface SysUserService {
    public SysUser findByUserName(String username);
}
