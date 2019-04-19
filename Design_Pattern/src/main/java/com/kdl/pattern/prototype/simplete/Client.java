package com.kdl.pattern.prototype.simplete;

/**
 * @Author:少阳
 * @Date:2019/4/11
 */
public class Client {
    public Prototype startCopy(Prototype prototype){
        return prototype.clone();
    }
}
