package com.learn.polymorphic;

public class Poly01 {

    public static void main(String[] args) {
        Master tom = new Master("汤姆");
        Animal daHuang = new Dog("大黄");
        Food daBone = new Bone("大棒骨");
        tom.feed(daHuang, daBone);

        System.out.println("===============================");
        Animal daJu = new Cat("大橘");
        Food daHuangYu = new Fish("大黄鱼");
        tom.feed(daJu, daHuangYu);

        System.out.println("===============================");
        Animal coco = new Pig("Coco");
        Food rice = new Rice("米饭");
        tom.feed(coco, rice);
    }
}
