package com.kdl.pattern.factory;

/**
 * @Author:少阳
 * @Date:2019/3/31
 */
public class NoodleHall implements FoodProcessingImpl {
    @Override
    public void madeFood() {
        System.out.println("面馆开始制作面条");
    }
}
