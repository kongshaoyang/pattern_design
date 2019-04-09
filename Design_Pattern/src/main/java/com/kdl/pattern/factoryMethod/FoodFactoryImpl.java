package com.kdl.pattern.factoryMethod;

import com.kdl.pattern.FoodProcessingImpl;

/**
 * @Author:少阳
 * @Date:2019/3/31
 */
public interface FoodFactoryImpl {
    FoodProcessingImpl create();
}
