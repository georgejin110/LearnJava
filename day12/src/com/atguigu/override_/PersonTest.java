package com.atguigu.override_;

public class PersonTest {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.eat();
        s1.walk(18);

        s1.setMajor("CS");
        s1.study();

        System.out.println("================================");
        Student s2 = new Student("数学");
        s2.study();
    }
}
