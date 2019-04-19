package com.kdl.pattern.decorator.battercake;

/**
 * @Author:少阳
 * @Date:2019/4/18
 */
public class BaseBattercake extends Battercake {
    @Override
    public String getMsg() {
        return "煎饼";
    }

    @Override
    public int getPrice() {
        return 5;
    }
}
