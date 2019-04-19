package com.kdl.pattern.proxy.staticproxy;

import com.kdl.pattern.proxy.Houses;

/**
 * @Author:少阳
 * @Date:2019/4/15
 * 中介
 */
public class Intermediary implements Houses {
    private Renter renter;
    public Intermediary(Renter renter) {
        this.renter = renter;
    }
    @Override
    public void findHouses() {
        before();
        this.renter.findHouses();
        after();
    }
    private void before(){
        System.out.println("找房前的需求");
    }

    private void after(){
        System.out.println("房子找到了,准备入住");
    }
}
