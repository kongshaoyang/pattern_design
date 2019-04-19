package com.kdl.pattern.proxy.myproxy;

import com.kdl.pattern.proxy.Houses;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author:少阳
 * @Date:2019/4/16
 */
public class MyIntermediary implements MyInvocationHandler {
    private Object houses;
    public Object getInstance(Object houses){
        this.houses = houses;
        Class<?> clazz = houses.getClass();
        return MyProxy.newProxyInstance(new MyClassLoad(),clazz.getInterfaces(),  this);
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
