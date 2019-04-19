package com.kdl.pattern.proxy.dynamicproxy.cglibproxy;

import com.kdl.pattern.proxy.dynamicproxy.jdkproxy.JDKRenter;

/**
 * @Author:少阳
 * @Date:2019/4/16
 */
public class CglibTest {
    public static void main(String[] args) throws Exception {
        JDKRenter jdkRenter = (JDKRenter)new CglibProxy().getInstance(new JDKRenter().getClass());
        jdkRenter.findHouses();
    }
}
