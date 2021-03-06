package com.practise.pizzaStore;

public class BaconPizza extends Pizza{
    private double weight;

    public BaconPizza() {
    }

    public BaconPizza(int size, double price, String name, double weight) {
        super(size, price, name);
        this.weight = weight;
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // 重写父类
    public String show() {
        return super.show() + "\n培根克数: " + getWeight() + "g";
    }
}
