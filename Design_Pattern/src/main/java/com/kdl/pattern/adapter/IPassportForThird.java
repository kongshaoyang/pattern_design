package com.kdl.pattern.adapter;

/**
 * @Author:少阳
 * @Date:2019/4/17
 */
public interface IPassportForThird {
    ResultMsg loginForQQ(String qq);
    ResultMsg loginForTel(String phone);
}
