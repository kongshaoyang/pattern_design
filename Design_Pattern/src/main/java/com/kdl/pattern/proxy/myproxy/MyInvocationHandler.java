package com.kdl.pattern.proxy.myproxy;

import java.lang.reflect.Method;

/**
 * @Author:少阳
 * @Date:2019/4/16
 */
public interface MyInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;

}
