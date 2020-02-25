package com.zed.spring.security.oauth2.server.mapper;

import com.zed.spring.security.oauth2.server.domain.TbPermission;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.MyMapper;

import java.util.List;

/**
  * @author Zed
  * @date 2020/2/25 上午1:20
  * @contact shadowl91@163.com
  */
public interface TbPermissionMapper extends MyMapper<TbPermission> {
    List<TbPermission> selectByUserId(@Param("id") Long id);
}