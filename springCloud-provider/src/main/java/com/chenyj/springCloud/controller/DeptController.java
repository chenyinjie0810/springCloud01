package com.chenyj.springCloud.controller;

import com.chenyj.api.pojo.Dept;
import com.chenyj.springCloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author chenyj
 * @Description
 * @Date create by 2019/6/16 16:18
 * 陈银杰专属测试
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/dept/getDept/{id}")
    public String getDept(@PathVariable("id")Long id){
        Dept dept=new Dept();
        return deptService.getDept(id).toString();
    }
}
