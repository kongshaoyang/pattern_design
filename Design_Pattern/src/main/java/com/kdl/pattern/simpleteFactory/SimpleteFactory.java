package com.kdl.pattern.simpleteFactory;

import com.kdl.pattern.FoodProcessingImpl;

/**
 * @Author:少阳
 * @Date:2019/3/31
 */
public class SimpleteFactory {
    public FoodProcessingImpl createFoodProcessing(Class<? extends FoodProcessingImpl> clazz) {
        if(null != clazz){
            try {
               return clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }


}
