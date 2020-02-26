package com.zed.spring.security.oauth2.server.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Zed
 * @date 2020/2/22 下午11:00
 * @contact shadowl91@163.com
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthroizationServerConfigurationTest {
    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    @Test
    public void test() {
        System.out.println(passwordEncoder.encode("123456"));
    }
}
