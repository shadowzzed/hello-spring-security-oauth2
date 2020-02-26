package com.zed.spring.security.oauth2.resource.service.impl;

import com.zed.spring.security.oauth2.resource.domain.TbContent;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zed.spring.security.oauth2.resource.mapper.TbContentMapper;
import com.zed.spring.security.oauth2.resource.service.TbContentService;

import java.util.List;

/**
  * @author Zed
  * @date 2020/2/26 下午7:16
  * @contact shadowl91@163.com
  */
@Service
public class TbContentServiceImpl implements TbContentService{

    @Resource
    private TbContentMapper tbContentMapper;

    @Override
    public List<TbContent> selectAll() {
        return tbContentMapper.selectAll();
    }
}
