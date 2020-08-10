package com.example.htwo.mapper.h2;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Update;

public interface SprDDLMapper extends BaseMapper {
    @Update(" CREATE TABLE BILL_CACHE_H2\n" +
            "(\n" +
            "    id BIGINT(20) NOT NULL AUTO_INCREMENT  COMMENT '主键ID' ,\n" +
            "    bill_no VARCHAR(30) NULL DEFAULT NULL COMMENT '单号',\n" +
            "    transfer_state INT(11) NULL DEFAULT NULL COMMENT '单据传输状态',\n" +
            "    message VARCHAR(30) NULL DEFAULT NULL COMMENT '单据传输信息',\n" +
            "    error_code VARCHAR(30) NULL DEFAULT NULL COMMENT '错误码',\n" +
            "    create_date Datetime NULL DEFAULT NULL COMMENT '创建日期',\n" +
            "    retries INT(11) NULL DEFAULT NULL COMMENT '传输重试次数',\n" +
            "    PRIMARY KEY (id)\n" +
            ");  ")
    public void createTable_BIllCacheInfo();
}
