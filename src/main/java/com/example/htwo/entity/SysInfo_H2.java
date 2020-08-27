package com.example.htwo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 接收第三方系统的单据，并缓存下来
 */
@TableName("sys_info")
public class SysInfo_H2 implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @TableField("message")
    private String message;
    @TableField("create_date")
    private Date createDate;


    private SysInfo_H2() {
    }

    public SysInfo_H2(String message) {
        this.createDate = new Date();
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setErrorMessage(String message) {
        this.message = message;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

}
