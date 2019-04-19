package com.kdl.pattern.proxy.delegate;

/**
 * @Author:少阳
 * @Date:2019/4/16
 */
public class Boss {
    public void command(String str,Leader leader){
        leader.doing(str);
    }
}
