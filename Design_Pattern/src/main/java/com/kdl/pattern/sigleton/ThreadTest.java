package com.kdl.pattern.sigleton;

import com.kdl.pattern.sigleton.lazy.LazySingleton;

/**
 * @Author:少阳
 * @Date:2019/4/11
 */
public class ThreadTest implements Runnable {
    @Override
    public void run() {
        LazySingleton lazySigleton =  LazySingleton.getInstance();
        System.out.println("ThreadTest===="+Thread.currentThread().getName() + ":"+ lazySigleton);
    }
}
