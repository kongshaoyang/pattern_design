package com.kdl.pattern.factory;

/**
 * @Author:少阳
 * @Date:2019/3/31
 */
public class Restaurant implements FoodProcessingImpl {
    @Override
    public void madeFood() {
        System.out.println("餐馆开始制作米饭");
    }
}
