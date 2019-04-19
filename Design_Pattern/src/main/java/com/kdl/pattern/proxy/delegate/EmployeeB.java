package com.kdl.pattern.proxy.delegate;

/**
 * @Author:少阳
 * @Date:2019/4/16
 */
public class EmployeeB implements IEmployee {

    @Override
    public void doing(String command) {
        System.out.println("我是员工B,擅长架构，开始干活"+command);
    }
}
