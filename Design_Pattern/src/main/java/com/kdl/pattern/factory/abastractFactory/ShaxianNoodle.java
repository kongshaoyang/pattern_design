package com.kdl.pattern.factory.abastractFactory;


/**
 * @Author:少阳
 * @Date:2019/3/31
 */
public class ShaxianNoodle implements NoodleImpl {
    @Override
    public void madeNoodle() {
        System.out.println("制作沙县面条");
    }
}
