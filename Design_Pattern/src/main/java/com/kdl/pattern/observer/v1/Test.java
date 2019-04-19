package com.kdl.pattern.observer.v1;

/**
 * @Author:少阳
 * @Date:2019/4/19
 */
public class Test {
    public static void main(String[] args) {
        Question question = new Question();
        question.setName("如何学习观察者模式");
        question.setContext("观察者模式看不懂，不知道如何学习");
        Teacher teacher = new Teacher();
        teacher.setName("Tom");
        GPer g = GPer.getInstance();
        g.publishQuestion(question);
        teacher.update(g,question);
    }
}
