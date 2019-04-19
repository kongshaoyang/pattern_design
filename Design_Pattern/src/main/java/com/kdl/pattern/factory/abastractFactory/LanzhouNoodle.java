package com.kdl.pattern.factory.abastractFactory;


/**
 * @Author:少阳
 * @Date:2019/3/31
 */
public class LanzhouNoodle implements NoodleImpl {
    @Override
    public void madeNoodle() {
        System.out.println("开始制作兰州拉面");
    }
}
