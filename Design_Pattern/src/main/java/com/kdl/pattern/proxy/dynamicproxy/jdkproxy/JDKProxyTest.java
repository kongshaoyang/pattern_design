package com.kdl.pattern.proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.Method;

/**
 * @Author:少阳
 * @Date:2019/4/16
 */
public class JDKProxyTest {
    public static void main(String[] args) {
        try {
            Object jdkIntermediary = new JDKIntermediary().getInstance(new JDKRenter());
            Method method = jdkIntermediary.getClass().getMethod("findHouses",null);
            method.invoke(jdkIntermediary);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
