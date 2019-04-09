package com.kdl.pattern.factoryMethod;


import com.kdl.pattern.FoodProcessingImpl;
import com.kdl.pattern.Restaurant;

/**
 * @Author:少阳
 * @Date:2019/3/31
 */
public class RestaurantFactory implements FoodFactoryImpl {

    public FoodProcessingImpl create() {
        return new Restaurant();
    }
}
