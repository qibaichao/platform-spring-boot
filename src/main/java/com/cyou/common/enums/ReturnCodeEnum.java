package com.cyou.common.enums;

import java.util.HashSet;

/**
 * 类ErrorCode.java的实现描述：系统返回码
 * 
 * @author qibaichao 2014年7月22日 上午10:39:05
 */
public enum ReturnCodeEnum {

    /**
     * 成功
     */
    SUCCESS(0, "成功"),
    /**
     * 失败
     */
    FAILURE(1, "失败"),

    /**
     * 参数错误
     */
    PARAM_ERROR(2, "参数错误"),

    /**
     * 系统错误
     */
    SYSTEM_ERROR(3, "系统错误");

    /** The code. */
    private final int code;

    /** The desc. */
    private final String desc;

    private ReturnCodeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    private static HashSet<Integer> hashSet;

    static {
        hashSet = new HashSet<Integer>();
        hashSet.clear();
        for (ReturnCodeEnum returnStatus : ReturnCodeEnum.values()) {
            hashSet.add(returnStatus.getCode());
        }
    }

    public static boolean isDefined(int value) {
        if (hashSet.contains(value)) {
            return true;
        }
        return false;
    }

}
