package com.zed.spring.security.oauth2.server.service.impl;

import com.zed.spring.security.oauth2.server.domain.TbPermission;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zed.spring.security.oauth2.server.mapper.TbPermissionMapper;
import com.zed.spring.security.oauth2.server.service.TbPermissionService;

import java.util.List;

/**
 * @author Zed
 * @date 2020/2/25 上午1:13
 * @contact shadowl91@163.com
 */
@Service
public class TbPermissionServiceImpl implements TbPermissionService {

    @Resource
    private TbPermissionMapper tbPermissionMapper;

    @Override
    public List<TbPermission> selectByUserId(Long id) {
        return tbPermissionMapper.selectByUserId(id);
    }
}

