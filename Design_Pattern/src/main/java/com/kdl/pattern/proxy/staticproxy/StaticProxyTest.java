package com.kdl.pattern.proxy.staticproxy;

/**
 * @Author:少阳
 * @Date:2019/4/15
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        Intermediary intermediary = new Intermediary(new Renter());
        intermediary.findHouses();
    }
}
