package com.practise.pizzaStore;


/*
    抽象类的练习， 所有定义的抽象类必须要在子类里定义
    其实可以不加这个抽象类，因为子类Pizza.java 已经封装了，另外还写了一个PizzaInterface接口，
    在这里仅仅只是练习抽象类，加深印象，改抽象类不会被调用
 */

public abstract class PizzaAbstract implements PizzaNameInterface,
        PizzaPriceInterface, PizzaSizeInterface {

    public abstract int getSize();
    public abstract void setSize(int size);
    public abstract String getName();
    public abstract void setName(String name);
    public abstract double getPrice();
    public abstract void setPrice(double price);
}
