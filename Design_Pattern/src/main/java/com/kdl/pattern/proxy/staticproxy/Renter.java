package com.kdl.pattern.proxy.staticproxy;

import com.kdl.pattern.proxy.Houses;

/**
 * @Author:少阳
 * @Date:2019/4/15
 * 租客
 */
public class Renter implements Houses {
    @Override
    public void findHouses() {
        System.out.println("我需要一个地段好，价格便宜的房屋");
    }
}
