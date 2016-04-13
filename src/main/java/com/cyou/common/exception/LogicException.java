package com.cyou.common.exception;

import com.cyou.common.enums.ReturnCodeEnum;

/**
 * 类LogicException.java的实现描述：业务异常
 * 
 * @author qibaichao 2014年7月21日 下午6:14:21
 */
public class LogicException extends Exception {

    private static final long serialVersionUID = -5147581356988161519L;
    /**
     * 错误码
     */
    private ReturnCodeEnum ReturnCodeEnum;
    /**
     * 错误信息
     */
    private String message;

    public LogicException(ReturnCodeEnum ReturnCodeEnum, String message) {
        super(message);
        this.ReturnCodeEnum = ReturnCodeEnum;
        this.message = message;
    }

    public LogicException(ReturnCodeEnum ReturnCodeEnum) {
        super(ReturnCodeEnum.getDesc());
        this.ReturnCodeEnum = ReturnCodeEnum;
        this.message = ReturnCodeEnum.getDesc();
    }

    public ReturnCodeEnum getReturnCodeEnum() {
        return ReturnCodeEnum;
    }

    public void setReturnCodeEnum(ReturnCodeEnum returnCodeEnum) {
        ReturnCodeEnum = returnCodeEnum;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
