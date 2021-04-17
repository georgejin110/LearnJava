package com.practise.pizzaStore;

public class FruitPizza extends Pizza{

    private String fruits;

    public FruitPizza() {
    }

    public FruitPizza(int size, double price, String name, String fruits) {
        super(size, price, name);
        this.fruits = fruits;
    }

    public String getFruits() {
        return fruits;
    }

    public void setFruits(String fruits) {
        this.fruits = fruits;
    }

    // 重写父类
    public String show() {
        return super.show() + "\n配料水果: " + getFruits();
    }
}
