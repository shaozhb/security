package com.t7242.security.mapper;

import com.t7242.security.model.Permission;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface PermissionMapper {

    public List<Permission> findAll();
    public List<Permission> findByAdminUserId(int userId);
}
