package com.zed.spring.security.oauth2.resource.service;

import com.zed.spring.security.oauth2.resource.domain.TbContent;

import java.util.List;

/**
  * @author Zed
  * @date 2020/2/26 下午7:16
  * @contact shadowl91@163.com
  */
public interface TbContentService{

    List<TbContent> selectAll();

}
