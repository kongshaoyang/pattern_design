package com.kdl.pattern.factory.abastractFactory;


/**
 * @Author:少阳
 * @Date:2019/3/31
 */
public abstract class AbstractFoodMehodFactory {
   public abstract NoodleImpl createNoodle();
   public abstract DumplingsImpl createDumpling();
}
