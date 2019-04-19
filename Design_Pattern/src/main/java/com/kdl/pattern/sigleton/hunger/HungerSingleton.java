package com.kdl.pattern.sigleton.hunger;

/**
 * @Author:少阳
 * @Date:2019/4/11
 */
public class HungerSingleton {
    private static final HungerSingleton hungerSigleton;
    static {
        hungerSigleton = new HungerSingleton();
    }
    private HungerSingleton(){
    }
    public static HungerSingleton getInstance(){
        return hungerSigleton;
    }
}
