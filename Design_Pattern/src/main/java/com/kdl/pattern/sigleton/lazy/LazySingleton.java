package com.kdl.pattern.sigleton.lazy;

/**
 * @Author:少阳
 * @Date:2019/4/11
 */
public class LazySingleton {
    private static LazySingleton lazySigleton = null;
    private LazySingleton(){
    }
    public synchronized static LazySingleton getInstance(){
        if(null == lazySigleton){
            synchronized (LazySingleton.class){
                if(null == lazySigleton){
                    lazySigleton =  new LazySingleton();
                }
            }
        }
        return lazySigleton;
    }


}
