package com.t7242.security.service;

import com.t7242.security.model.Permission;

import java.util.List;

public interface PermissionService {
    public List<Permission> findAll();
    public List<Permission> findByAdminUserId(int userId);
}
