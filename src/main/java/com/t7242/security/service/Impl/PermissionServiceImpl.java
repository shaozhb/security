package com.t7242.security.service.Impl;

import com.t7242.security.mapper.PermissionMapper;
import com.t7242.security.model.Permission;
import com.t7242.security.service.PermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {
    @Resource
    PermissionMapper permissionMapper;
    @Override
    public List<Permission> findAll() {
        return permissionMapper.findAll();
    }

    @Override
    public List<Permission> findByAdminUserId(int userId) {
        return permissionMapper.findByAdminUserId(userId);
    }
}
