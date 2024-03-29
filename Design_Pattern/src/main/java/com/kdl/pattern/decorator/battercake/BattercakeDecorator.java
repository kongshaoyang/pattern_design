package com.kdl.pattern.decorator.battercake;

/**
 * @Author:少阳
 * @Date:2019/4/18
 */
public class BattercakeDecorator extends Battercake{
    private Battercake battercake;

    public BattercakeDecorator(Battercake battercake) {
        this.battercake = battercake;
    }

    @Override
    public String getMsg() {
        return this.battercake.getMsg();
    }

    @Override
    public int getPrice() {
        return this.battercake.getPrice();
    }
}
