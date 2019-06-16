package com.chenyj.springCloud.service.impl;

import com.chenyj.api.pojo.Dept;
import com.chenyj.springCloud.mapper.DeptMapper;
import com.chenyj.springCloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author chenyj
 * @Description
 * @Date create by 2019/6/16 16:17
 * 陈银杰专属测试
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public Dept getDept(Long id) {
        return deptMapper.getDept(id);
    }
}
