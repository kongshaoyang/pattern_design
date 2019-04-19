package com.kdl.pattern.factory.simpleteFactory;


import com.kdl.pattern.factory.FoodProcessingImpl;
import com.kdl.pattern.factory.NoodleHall;

/**
 * @Author:少阳
 * @Date:2019/3/31
 */
public class SimpleteFactoryTest {
    public static void main(String[] args) {
        SimpleteFactory simpleteFactory = new SimpleteFactory();
       FoodProcessingImpl foodProcessing = simpleteFactory.createFoodProcessing(NoodleHall.class);
       foodProcessing.madeFood();
    }
}
