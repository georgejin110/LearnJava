package com.practise.pizzaStore;

/*
    对Pizza的一些基本数据进行封装，有 pizza名（name），价格（price）和尺寸（size）
    这里之所以引用一个PizzaInterface多个接口是为了加深接口的印象，其实可以不用引用该接口，因为
    已经做了封装，另外就是还写了一个PizzaAbstract抽象类，只是作为练习，该抽象类也调用了
    PizzaInterface接口，具体可以看PizzaAbstract.java
 */
public class Pizza implements PizzaSizeInterface, PizzaPriceInterface, PizzaNameInterface {

    private int size;
    private double price;
    private String name;

    public Pizza() {
    }

    public Pizza(int size, double price, String name) {
        this.size = size;
        this.price = price;
        this.name = name;
    }

    @Override
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
