package com.chenyj.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Author chenyj
 * @Description
 * @Date create by 2019/6/16 9:52
 * 陈银杰专属测试
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
@Accessors(chain=true)
public class Dept {

    private Long id;
    private String last_name;
    private String db_source;

    /*public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getDb_source() {
        return db_source;
    }

    public void setDb_source(String db_source) {
        this.db_source = db_source;
    }*/

   /* @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", last_name='" + last_name + '\'' +
                ", db_source='" + db_source + '\'' +
                '}';
    }*/
}
