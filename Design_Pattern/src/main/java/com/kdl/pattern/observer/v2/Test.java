package com.kdl.pattern.observer.v2;

import com.google.common.eventbus.EventBus;

/**
 * @Author:少阳
 * @Date:2019/4/19
 */
public class Test {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        TeacherV2 teacher = new TeacherV2("Tom");
        eventBus.register(teacher);
        QuestionV2 question = new QuestionV2();
        question.setName("如何学习观察者模式");
        question.setContext("观察者模式看不懂，不知道如何学习");
        eventBus.post(question);


    }
}
