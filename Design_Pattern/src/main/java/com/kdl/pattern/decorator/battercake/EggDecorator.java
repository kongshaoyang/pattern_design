package com.kdl.pattern.decorator.battercake;

/**
 * @Author:少阳
 * @Date:2019/4/18
 */
public class EggDecorator extends BattercakeDecorator {
    public EggDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    public String getMsg() {
        return super.getMsg()+"1个鸡蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice() +1;
    }
}
