package com.kdl.pattern.proxy.myproxy;

import com.kdl.pattern.proxy.Houses;
import com.kdl.pattern.proxy.dynamicproxy.jdkproxy.JDKIntermediary;
import com.kdl.pattern.proxy.dynamicproxy.jdkproxy.JDKRenter;

import java.lang.reflect.Method;

/**
 * @Author:少阳
 * @Date:2019/4/16
 */
public class MyTest {
    public static void main(String[] args) {
        try {
            Houses myIntermediary = (Houses) new MyIntermediary().getInstance(new JDKRenter());
            myIntermediary.findHouses();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
