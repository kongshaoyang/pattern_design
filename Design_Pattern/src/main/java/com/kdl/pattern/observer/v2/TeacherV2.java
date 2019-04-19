package com.kdl.pattern.observer.v2;

import com.google.common.eventbus.Subscribe;

/**
 * @Author:少阳
 * @Date:2019/4/19
 */
public class TeacherV2 {
    private String userName;

    public TeacherV2(String userName) {
        this.userName = userName;
    }

    @Subscribe
    public void getMessage(QuestionV2 question){
        System.out.println(this.userName+"老师,您收到一个问题，" +
                "问题题目是"+question.getName()+",它的内容是"+question.getContext() );
    }
}
