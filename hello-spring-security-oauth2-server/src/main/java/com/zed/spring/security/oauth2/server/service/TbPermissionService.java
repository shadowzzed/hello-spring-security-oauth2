package com.zed.spring.security.oauth2.server.service;

import com.zed.spring.security.oauth2.server.domain.TbPermission;

import java.util.List;

/**
 * @author Zed
 * @date 2020/2/25 上午1:13
 * @contact shadowl91@163.com
 */
public interface TbPermissionService {

    List<TbPermission> selectByUserId(Long id);

}

