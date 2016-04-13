package com.cyou.common.core;

import java.io.Serializable;

import com.cyou.common.enums.ReturnCodeEnum;

/**
 * 类ResultBean.java的实现描述：TODO 类实现描述
 * 
 * @author qibaichao 2014年7月22日 上午10:16:04
 */
public class ResultBean implements Serializable {

    private static final long serialVersionUID = 8400341083688596453L;

    private ReturnCodeEnum returnCodeEnum;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ReturnCodeEnum getReturnCodeEnum() {
        return returnCodeEnum;
    }

    public void setReturnCodeEnum(ReturnCodeEnum returnCodeEnum) {
        this.returnCodeEnum = returnCodeEnum;
    }

    public ResultBean() {
        this.success();
    }

    /**
     * 成功
     */
    public void success() {
        this.returnCodeEnum = ReturnCodeEnum.SUCCESS;
    }

    /**
     * 失败
     * 
     * @param message
     */
    public void failure(String message) {
        this.returnCodeEnum = ReturnCodeEnum.FAILURE;
        this.message = message;
    }

    /**
     * 失败
     * 
     * @param returnCodeEnum
     * @param message
     */
    public void failure(ReturnCodeEnum returnCodeEnum, String message) {
        this.returnCodeEnum = returnCodeEnum;
        this.message = message;
    }

}
