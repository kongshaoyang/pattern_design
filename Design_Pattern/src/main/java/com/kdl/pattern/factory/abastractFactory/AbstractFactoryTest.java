package com.kdl.pattern.factory.abastractFactory;


/**
 * @Author:少阳
 * @Date:2019/3/31
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        LanZhouFactory lanZhouFactory = new LanZhouFactory();
        lanZhouFactory.createDumpling().madeDumplings();

        ShaxianFactory shaxianFactory = new ShaxianFactory();
        shaxianFactory.createDumpling().madeDumplings();
    }
}
