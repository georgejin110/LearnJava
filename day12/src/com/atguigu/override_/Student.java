package com.atguigu.override_;

public class Student extends Person{

    private String major;

    public Student() {
    }

    public Student(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // 对父类方法进行了重写
    public void eat() {
        System.out.println("吃薯片");
    }

    public void study() {
        System.out.println("学习。专业是: " + major);
    }


}
