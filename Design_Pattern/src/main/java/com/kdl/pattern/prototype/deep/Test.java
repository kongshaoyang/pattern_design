package com.kdl.pattern.prototype.deep;

/**
 * @Author:少阳
 * @Date:2019/4/11
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(18);
        person.setName("李四");
        Person copyPerson = (Person) person.deepClone();
        System.out.println(person.toString());
        System.out.println(copyPerson.toString());
        System.out.println(person == copyPerson);
    }
}
