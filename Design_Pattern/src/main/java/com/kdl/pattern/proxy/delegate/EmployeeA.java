package com.kdl.pattern.proxy.delegate;

/**
 * @Author:少阳
 * @Date:2019/4/16
 */
public class EmployeeA implements IEmployee {

    @Override
    public void doing(String command) {
        System.out.println("我是员工A,擅长加密，开始干活"+command);
    }
}
