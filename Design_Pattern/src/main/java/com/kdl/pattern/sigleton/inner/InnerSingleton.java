package com.kdl.pattern.sigleton.inner;

/**
 * @Author:少阳
 * @Date:2019/4/11
 */
public class InnerSingleton {
    private InnerSingleton(){
    }
    public static final InnerSingleton getInstance(){
        return InnerClass.inner;
    }

    private static class InnerClass{
        private static final InnerSingleton inner  = new InnerSingleton();
    }
}
