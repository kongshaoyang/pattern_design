package com.kdl.pattern.observer.v1;

import java.util.Observable;

/**
 * @Author:少阳
 * @Date:2019/4/19
 * 被观察者类
 */
public class GPer extends Observable {
    private static GPer gper = null;
    private  String name = "GPer生态圈";

    public String getName() {
        return name;
    }

    private GPer(){}
    public static GPer getInstance(){
        if(null == gper){
            gper = new GPer();
        }
        return gper;
    }

    public void publishQuestion(Question question){
        System.out.println("问题:"+question.getName()+",内容:"+question.getContext()+"在"+name+"进行了发布");
        setChanged();
        notifyObservers(question);
    }
}
