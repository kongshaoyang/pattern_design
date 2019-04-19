package com.kdl.pattern.proxy.delegate;

/**
 * @Author:少阳
 * @Date:2019/4/16
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.command("架构",new Leader());
    }
}
