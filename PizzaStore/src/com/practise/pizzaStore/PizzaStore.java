package com.practise.pizzaStore;

import java.util.Scanner;

public class PizzaStore {
    // 方法： 提供Pizza
    public static Pizza getPizza(int num) {
//        pizzaName = pizzaName.toLowerCase();
        Pizza pizza = null;

//        if ("bacon".equals(pizzaName)) { // pizzaName.equals("bacon")容易引发空指针异常
//            pizza = new BaconPizza();
//        }

        Scanner in = new Scanner(System.in);
        int size;
        double price;


        switch (num) {
            case 1:

                // 培根克数
                System.out.print("请输入培根的克数: ");
                double weight = in.nextDouble();

                // 输入大小
                System.out.print("请输入匹萨的大小: ");
                size = in.nextInt();

                // 输入价格
                System.out.print("请输入匹萨的价格: ");
                price = in.nextDouble();

                pizza = new BaconPizza(size,price,"培根匹萨",weight);
                break;
            case 2:

                // 输入水果
                System.out.print("请输入你想要加入的水果: ");
                String fruits = in.next();

                // 输入大小
                System.out.print("请输入匹萨的大小: ");
                size = in.nextInt();

                // 输入价格
                System.out.print("请输入匹萨的价格: ");
                price = in.nextDouble();

                pizza = new FruitPizza(size,price,"水果匹萨",fruits);
                break;
        }
        return pizza;
    }
}
