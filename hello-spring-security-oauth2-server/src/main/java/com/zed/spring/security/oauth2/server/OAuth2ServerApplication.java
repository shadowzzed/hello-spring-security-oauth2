package com.zed.spring.security.oauth2.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author Zed
 * @date 2020/2/22 下午6:43
 * @contact shadowl91@163.com
 */
@SpringBootApplication
@MapperScan(basePackages = "com.zed.spring.security.oauth2.server.mapper")
public class OAuth2ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(OAuth2ServerApplication.class, args);
    }
}
