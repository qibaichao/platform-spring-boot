package com.cyou;

import com.alibaba.fastjson.JSON;
import com.cyou.common.enums.ReturnCodeEnum;

public class ErrorCodeTest {

    public static void main(String args[]) {

        System.out.println(ReturnCodeEnum.SYSTEM_ERROR.getDesc());
        int[] a = {
                1, 2
        };
        System.out.println(JSON.toJSON(a));

    }

}
