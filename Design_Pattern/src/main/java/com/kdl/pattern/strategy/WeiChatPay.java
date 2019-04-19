package com.kdl.pattern.strategy;

/**
 * @Author:少阳
 * @Date:2019/4/16
 */
public class WeiChatPay extends Payment {
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    protected double queryBalance() {
        return 123;
    }
}
