package com.chenyj.springCloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author chenyj
 * @Description
 * @Date create by 2019/6/16 18:14
 * 陈银杰专属测试
 */

@Configuration
public class MyConfig {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
