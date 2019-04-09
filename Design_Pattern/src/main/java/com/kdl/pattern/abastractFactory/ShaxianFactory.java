package com.kdl.pattern.abastractFactory;

/**
 * @Author:少阳
 * @Date:2019/3/31
 */
public class ShaxianFactory extends AbstractFoodMehodFactory {
    @Override
    public NoodleImpl createNoodle() {
        return new ShaxianNoodle();
    }
    @Override
    public DumplingsImpl createDumpling() {
        return new ShaxianDumpling();
    }
}
