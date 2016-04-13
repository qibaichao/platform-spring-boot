package com.cyou.common.core;

import java.util.List;

import com.cyou.common.enums.ReturnCodeEnum;

/**
 * 类ResultPOListBean.java的实现描述：TODO 类实现描述
 * 
 * @author qibaichao 2014年7月22日 上午10:16:41
 */
public class ResultVoListBean<T> extends ResultBean {

    private static final long serialVersionUID = 867933019328199779L;

    private Integer count;

    private List<T> value;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<T> getValue() {
        return value;
    }

    public void setValue(List<T> value) {
        this.value = value;
    }

    public void success(List<T> value, Integer count) {
        this.setReturnCodeEnum(ReturnCodeEnum.SUCCESS);
        this.value = value;
        this.count = count;
    }

}
