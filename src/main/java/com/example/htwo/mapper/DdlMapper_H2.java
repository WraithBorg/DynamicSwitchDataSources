package com.example.htwo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface DdlMapper_H2 extends BaseMapper {
    @Update(" CREATE TABLE sys_info\n" +
            "(\n" +
            "    id BIGINT(20) NOT NULL AUTO_INCREMENT  COMMENT '主键ID' ,\n" +
            "    message VARCHAR(30) NULL DEFAULT NULL COMMENT '信息',\n" +
            "    create_date Datetime NULL DEFAULT NULL COMMENT '创建日期',\n" +
            "    PRIMARY KEY (id)\n" +
            ");  ")
    public void createTable_SysInfo();

    @Select(" show tables; ")
    public List<String> showTables();

    @Update(" DROP TABLE IF EXISTS `sys_info`;")
    public void dropTable_SysInfo();

}
