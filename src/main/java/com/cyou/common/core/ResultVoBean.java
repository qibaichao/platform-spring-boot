package com.cyou.common.core;

import com.cyou.common.enums.ReturnCodeEnum;

/**
 * 类ResultPOBean.java的实现描述：TODO 类实现描述
 * 
 * @author qibaichao 2014年7月22日 上午10:16:35
 */
public class ResultVoBean<T> extends ResultBean {

    private static final long serialVersionUID = 2786819177462037719L;

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    /**
     * 成功
     */
    public void success(T value) {
        this.setReturnCodeEnum(ReturnCodeEnum.SUCCESS);
        this.value = value;
    }
}
