package com.kdl.pattern.sigleton.seriable;

import java.io.Serializable;

/**
 * @Author:少阳
 * @Date:2019/4/11
 */
public class SeriableSingleton implements Serializable {
    public static final SeriableSingleton seriableSingleton = new SeriableSingleton();
    private SeriableSingleton(){}
    public static SeriableSingleton getInstance(){
        return seriableSingleton;
    }
    private  Object readResolve(){
        return  seriableSingleton;
    }
}
