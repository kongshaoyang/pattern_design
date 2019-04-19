package com.kdl.pattern.strategy;

/**
 * @Author:少阳
 * @Date:2019/4/16
 */
public abstract class Payment {

public abstract String getName();

protected abstract double queryBalance();

public void pay(String uid, double amount) {
    if(queryBalance() < amount){
        System.out.println("支付失败,余额不足");
        return;
    }
        System.out.println("支付成功,支付金额:"+amount);
    }
}
