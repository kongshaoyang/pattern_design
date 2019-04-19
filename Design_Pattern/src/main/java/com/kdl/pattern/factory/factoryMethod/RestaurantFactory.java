package com.kdl.pattern.factory.factoryMethod;


import com.kdl.pattern.factory.FoodProcessingImpl;
import com.kdl.pattern.factory.Restaurant;

/**
 * @Author:少阳
 * @Date:2019/3/31
 */
public class RestaurantFactory implements FoodFactoryImpl {

    public FoodProcessingImpl create() {
        return new Restaurant();
    }
}
