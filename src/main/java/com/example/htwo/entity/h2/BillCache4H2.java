package com.example.htwo.entity.h2;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 接收第三方系统的单据，并缓存下来
 */
@TableName("bill_cache_h2")
public class BillCache4H2 implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    private int id;
    @TableField("bill_no")
    private String billNo;
    @TableField("transfer_state")
    private Integer transferState;
    @TableField("message")
    private String message;
    @TableField("error_code")
    private String errorCode;
    @TableField("create_date")
    private Date createDate;
    @TableField("retries")
    private Integer retries;

    private BillCache4H2() {
    }

    public BillCache4H2(String billNo, Integer transferState, String message, String errorCode) {
        this.billNo = billNo;
        this.transferState = transferState;
        this.message = message;
        this.errorCode = errorCode;
        this.createDate = new Date();
        this.retries = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public Integer getTransferState() {
        return transferState;
    }

    public void setTransferState(Integer transferState) {
        this.transferState = transferState;
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

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getRetries() {
        return retries;
    }

    public void setRetries(Integer retries) {
        this.retries = retries;
    }
}
