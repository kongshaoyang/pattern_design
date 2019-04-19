package com.kdl.pattern.factory.factoryMethod;


import com.kdl.pattern.factory.FoodProcessingImpl;

/**
 * @Author:少阳
 * @Date:2019/3/31
 */
public interface FoodFactoryImpl {
    FoodProcessingImpl create();
}
