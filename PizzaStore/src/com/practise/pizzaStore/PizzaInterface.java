package com.practise.pizzaStore;

/*
    1.  类是类，接口是接口，他们是同一层次的概念
    2.  接口中没有构造器
    3.  接口如何声明： interface
    4.  在jdk1.8之前接口只有两部分内容：
        （1） 常量：固定修饰符： public static final
        （2） 抽象方法: 固定修饰符： public abstract
        注意：修饰符可以省略不写，IDE会帮你自动补全
    5.  类的接口的关系： 实现， 类实现接口
    6.  一旦实现一个接口，那么实现类要重写接口中的全部抽象方法
    7.  如果没有全部重写抽象方法，那么这个类可以变成一个抽象类
    8.  java只有单继承，但可以多实现
        一个类继承其他类，只能直接继承一个父类
        但是实现类实现接口的话，可以实现多个接口
    9.  写法： 先继承再实现： extends Class implements interface
    10. 接口不能创建对象，因为接口不是类
 */

interface PizzaSizeInterface {
    // 常量：
    public static final int size = 0;

    // 抽象方法：
    public abstract void setSize(int size);
    public abstract int getSize();

}

interface PizzaPriceInterface {
    public static final double price = 0.0;

    public abstract double getPrice();
    public abstract void setPrice(double price);

}

interface PizzaNameInterface {
    public static final String name = "";

    public abstract String getName();
    public abstract void setName(String name);
}