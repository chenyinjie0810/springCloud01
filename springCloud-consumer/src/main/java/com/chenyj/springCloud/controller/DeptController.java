package com.chenyj.springCloud.controller;

import com.chenyj.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author chenyj
 * @Description
 * @Date create by 2019/6/16 18:22
 * 陈银杰专属测试
 */
@RestController
public class DeptController {

    private String REST_URL_PREFIX="http://localhost:8001/";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/getDept/{id}")
    public String getDept(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX + "dept/getDept/" + id, Dept.class).toString();
    }
}
