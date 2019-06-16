package com.chenyj.springCloud.mapper;

import com.chenyj.api.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Author chenyj
 * @Description
 * @Date create by 2019/6/16 16:14
 * 陈银杰专属测试
 */
@Mapper
public interface DeptMapper {

    @Select(" select * from dept t where t.id =#{id}")
    Dept getDept(Long id);
}
