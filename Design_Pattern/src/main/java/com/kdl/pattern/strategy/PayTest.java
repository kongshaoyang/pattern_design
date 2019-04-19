package com.kdl.pattern.strategy;

/**
 * @Author:少阳
 * @Date:2019/4/16
 */
public class PayTest {
    public static void main(String[] args) {
        Payment payAmount = StrategyFactory.getInstance("weichat");
        payAmount.pay("",1);
    }
}
