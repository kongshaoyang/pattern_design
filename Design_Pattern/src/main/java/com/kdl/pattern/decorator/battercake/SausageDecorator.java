package com.kdl.pattern.decorator.battercake;

/**
 * @Author:少阳
 * @Date:2019/4/18
 */
public class SausageDecorator extends BattercakeDecorator {
    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }
    @Override
    public String getMsg() {
        return super.getMsg() + "火腿肠";
    }
    @Override
    public int getPrice() {
        return super.getPrice()+2;
    }
}
