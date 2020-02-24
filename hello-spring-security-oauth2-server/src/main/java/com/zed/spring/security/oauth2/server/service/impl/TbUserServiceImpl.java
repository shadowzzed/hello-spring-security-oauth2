package com.zed.spring.security.oauth2.server.service.impl;

import com.zed.spring.security.oauth2.server.domain.TbUser;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zed.spring.security.oauth2.server.mapper.TbUserMapper;
import com.zed.spring.security.oauth2.server.service.TbUserService;
import tk.mybatis.mapper.entity.Example;

/**
 * @author Zed
 * @date 2020/2/25 上午1:13
 * @contact shadowl91@163.com
 */
@Service
public class TbUserServiceImpl implements TbUserService {

    @Resource
    private TbUserMapper tbUserMapper;

    @Override
    public TbUser getByUsername(String username) {
        Example example = new Example(TbUser.class);
        example.createCriteria().andEqualTo("username", username);
        return tbUserMapper.selectOneByExample(example);
    }
}

