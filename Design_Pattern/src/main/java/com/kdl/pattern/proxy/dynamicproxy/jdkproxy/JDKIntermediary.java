package com.kdl.pattern.proxy.dynamicproxy.jdkproxy;

import com.kdl.pattern.proxy.Houses;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author:少阳
 * @Date:2019/4/15
 */
public class JDKIntermediary implements InvocationHandler {
    private Houses houses;
    public Object getInstance(Houses houses){
        this.houses = houses;
        Class<?> clazz = houses.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object o = method.invoke(this.houses,args);
        after();
        return o;
    }
    private void before(){
        System.out.println("我是中介");
        System.out.println("开始找房");
    }
    private void after(){
        System.out.println("找好了，入住吧");
    }
}
