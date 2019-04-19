package com.kdl.pattern.observer.v1;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author:少阳
 * @Date:2019/4/19
 * 观察者类
 */
public class Teacher implements Observer {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 被观察者如果有变化，进行通知观察者
     * @param o
     * @param arg
     */
    @Override
    public void update(Observable o, Object arg) {
        GPer gper = (GPer)o;
        Question question = (Question)arg;
        System.out.println("===============================");
        System.out.println(name + "老师，你好！\n" +
                "您收到了一个来自“" + gper.getName() + "”的提问，希望您解答，问题内容如下：\n" +
                question.getContext());

    }
}
