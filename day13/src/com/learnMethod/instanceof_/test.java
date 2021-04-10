package com.learnMethod.instanceof_;

public class test {
    public static void main(String[] args) {
        Person person = new Woman();
        if (person instanceof Woman) {  // true
            Woman w1 = (Woman) person; // 强转 Person编译类型到Woman编译类型，可使用Woman自己的方法
        } else {
            System.out.println("Not Woman");
        }
    }
}

class Person {

}

class Woman extends Person {

}

class Man extends Person {

}
