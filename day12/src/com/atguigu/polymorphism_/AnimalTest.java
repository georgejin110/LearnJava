package com.atguigu.polymorphism_;

public class AnimalTest {

    public static void main(String[] args) {
        AnimalTest animalTest = new AnimalTest();
        Animal cat = new Cat();
        animalTest.func(cat);

        System.out.println("=========================");

        Animal dog = new Dog();
        animalTest.func(dog);
    }

    private void func(Animal animal) {
        animal.eat();
        animal.shout();
    }
}

class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("啃骨头");
    }

    @Override
    public void shout() {
        System.out.println("汪！");
    }
}

class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("吃鱼");
    }

    @Override
    public void shout() {
        System.out.println("喵！");
    }
}

class Animal {

    public void eat() {
        System.out.println("eat");
    }

    public void shout() {
        System.out.println("shout");
    }
}
