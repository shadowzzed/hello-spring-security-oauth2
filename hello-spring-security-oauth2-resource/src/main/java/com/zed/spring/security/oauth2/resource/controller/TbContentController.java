package com.zed.spring.security.oauth2.resource.controller;

import com.zed.spring.security.oauth2.resource.domain.TbContent;
import com.zed.spring.security.oauth2.resource.dto.ResponseResult;
import com.zed.spring.security.oauth2.resource.service.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Zed
 * @date 2020/2/26 下午7:18
 * @contact shadowl91@163.com
 */
@RestController
public class TbContentController {

    @Autowired
    private TbContentService tbContentService;

    @GetMapping("/")
    public ResponseResult<List<TbContent>> list() {
        return new ResponseResult<List<TbContent>>(HttpStatus.OK.value(), HttpStatus.OK.toString(), tbContentService.selectAll());
    }
}
