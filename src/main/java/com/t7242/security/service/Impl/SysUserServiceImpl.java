package com.t7242.security.service.Impl;

import com.t7242.security.mapper.PermissionMapper;
import com.t7242.security.mapper.SysUserMapper;
import com.t7242.security.model.Permission;
import com.t7242.security.model.SysUser;
import com.t7242.security.service.SysUserService;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService,UserDetailsService {
    @Resource
    SysUserMapper sysUserMapper;

    @Resource
    PermissionMapper permissionMapper;

    @Override
    public SysUser findByUserName(String username) {
        return sysUserMapper.findByUserName(username);
    }

    @Override
    public UserDetails loadUserByUsername(String username)  {

        SysUser user = sysUserMapper.findByUserName(username);
        if (user != null) {
            List<Permission> permissions = permissionMapper.findByAdminUserId(user.getId());
            List<GrantedAuthority> grantedAuthorities = new ArrayList <>();
            for (Permission permission : permissions) {
//                System.out.println("(permission++++++++++++++);"+permission.getName());
                if (permission != null && permission.getName()!=null) {

                    GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(permission.getName());
                    grantedAuthorities.add(grantedAuthority);
//                    System.out.println(grantedAuthority.getAuthority());
                }
            }
            return new User(user.getUsername(), user.getPassword(), grantedAuthorities);
        } else {
            throw new UsernameNotFoundException("admin: " + username + " do not exist!");
        }
    }
}
