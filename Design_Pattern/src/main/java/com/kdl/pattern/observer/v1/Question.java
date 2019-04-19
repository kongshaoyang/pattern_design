package com.kdl.pattern.observer.v1;

/**
 * @Author:少阳
 * @Date:2019/4/19
 */
public class Question {
    /**
     * 问题标题
     */
    private String name;
    /**
     * 问题内容
     */
    private String context;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
