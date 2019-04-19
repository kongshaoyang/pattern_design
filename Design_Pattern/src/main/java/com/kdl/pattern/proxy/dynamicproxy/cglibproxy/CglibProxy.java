package com.kdl.pattern.proxy.dynamicproxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author:少阳
 * @Date:2019/4/16
 */
public class CglibProxy implements MethodInterceptor {
    public Object getInstance(Class<?> clazz) throws Exception{
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object object =methodProxy.invokeSuper(o,objects);
        after();
        return object;
    }
    private void before(){
        System.out.println("我是中介");
        System.out.println("开始找房");
    }
    private void after(){
        System.out.println("找好了，入住吧");
    }
}
