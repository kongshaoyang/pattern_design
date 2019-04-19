package com.kdl.pattern.decorator.battercake;

/**
 * @Author:少阳
 * @Date:2019/4/18
 */
public class Test {
    public static void main(String[] args) {
        Battercake baseBattercake ;
        baseBattercake = new BaseBattercake();
        baseBattercake = new EggDecorator(baseBattercake);
        baseBattercake =  new SausageDecorator(baseBattercake);
        System.out.println("购买了"+baseBattercake.getMsg()+",总共花费"+baseBattercake.getPrice()+"元");

    }
}
