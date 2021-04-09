package com.learn.extend.improve_;

public class Extends01 {

    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "coco";
        pupil.age = 41;
        pupil.testing();
        pupil.setScore(60);
        pupil.showInfo();

        System.out.println("=======================");
        Graduate graduate = new Graduate();
        graduate.name = "alex";
        graduate.age = 18;
        graduate.testing();
        graduate.setScore(90);
        graduate.showInfo();
    }
}
