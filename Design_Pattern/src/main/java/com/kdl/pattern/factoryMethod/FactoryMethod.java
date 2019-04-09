package com.kdl.pattern.factoryMethod;

import com.kdl.pattern.FoodProcessingImpl;

/**
 * @Author:少阳
 * @Date:2019/3/31
 */
public class FactoryMethod {
    public static void main(String[] args) {
        FoodFactoryImpl foodFactory =  new NoodleFactory();
        FoodProcessingImpl foodProcessing = foodFactory.create();
        foodProcessing.madeFood();
    }
}
