package com.kdl.pattern.factory.abastractFactory;


/**
 * @Author:少阳
 * @Date:2019/3/31
 */
public class LanZhouFactory extends AbstractFoodMehodFactory {

    @Override
    public NoodleImpl createNoodle() {
        return new LanzhouNoodle();
    }

    @Override
    public DumplingsImpl createDumpling() {
        return new LanzhouDumpling();
    }
}
