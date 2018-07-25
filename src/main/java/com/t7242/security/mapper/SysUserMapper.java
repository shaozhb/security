package com.t7242.security.mapper;

import com.t7242.security.model.SysUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysUserMapper  {

    public SysUser findByUserName(String username);


}
