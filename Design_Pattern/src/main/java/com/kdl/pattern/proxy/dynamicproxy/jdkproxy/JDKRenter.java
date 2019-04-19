package com.kdl.pattern.proxy.dynamicproxy.jdkproxy;

import com.kdl.pattern.proxy.Houses;

/**
 * @Author:少阳
 * @Date:2019/4/15
 */
public class JDKRenter implements Houses {
    @Override
    public void findHouses() {
        System.out.println("租房");
    }
}
