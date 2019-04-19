package com.kdl.pattern.adapter;

/**
 * @Author:少阳
 * @Date:2019/4/17
 */
public interface LoginAdapter {
    boolean support(Object adapter);
    ResultMsg login(String str,Object loginAdapter);
}
