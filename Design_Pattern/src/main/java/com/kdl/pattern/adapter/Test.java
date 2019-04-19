package com.kdl.pattern.adapter;

/**
 * @Author:少阳
 * @Date:2019/4/17
 */
public class Test {
    public static void main(String[] args) {
        PassportForThirdAdapter pa = new PassportForThirdAdapter();
       ResultMsg resultMsg =  pa.loginForQQ("qq");
        System.out.println(resultMsg.getMessage());
    }
}
