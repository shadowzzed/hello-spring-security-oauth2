package com.zed.spring.security.oauth2.server.service.impl;

import com.zed.spring.security.oauth2.server.domain.TbPermission;
import com.zed.spring.security.oauth2.server.domain.TbUser;
import com.zed.spring.security.oauth2.server.service.TbPermissionService;
import com.zed.spring.security.oauth2.server.service.TbUserService;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

/**
 * @author Zed
 * @date 2020/2/25 上午1:24
 * @contact shadowl91@163.com
 */
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private TbUserService tbUserService;

    @Autowired
    private TbPermissionService tbPermissionService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        TbUser tbUser = tbUserService.getByUsername(s);
        List<GrantedAuthority> grantedAuthorities = Lists.newArrayList();
        if (tbUser != null) {
            List<TbPermission> tbPermissions = tbPermissionService.selectByUserId(tbUser.getId());
            tbPermissions.forEach(tbPermission -> {
                GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(tbPermission.getEnname());
                grantedAuthorities.add(grantedAuthority);
            });
            return new User(tbUser.getUsername(), tbUser.getPassword(), grantedAuthorities);
        }
       return null;
    }
}
