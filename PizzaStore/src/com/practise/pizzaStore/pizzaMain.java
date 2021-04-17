package com.practise.pizzaStore;

import java.util.Scanner;

public class pizzaMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请选择想到制作的匹萨: 1.培根匹萨 2.水果匹萨: ");
        int num = in.nextInt();
        String name = "";
        switch (num) {
            case 1:
                name = "bacon";
                break;
            case 2:
                name = "fruit";
                break;
            default:
                System.out.println("请输入正确的选项");
                System.exit(0);
        }

        Pizza pizza = PizzaStore.getPizza(name);


        if ("bacon".equals(name)) {
            // 培根匹萨
            printBaconPizza(pizza);
        } else if ("fruit".equals(name)) {
            // 水果匹萨
            name = "水果匹萨";
            printFruitPizza(name);
        }
    }

    private static void printBaconPizza(Pizza pizza1) {
        Scanner in = new Scanner(System.in);
        pizza1.setName("培根匹萨");

        // 向下转型： Pizza -> BaconPizza
        BaconPizza baconPizza = (BaconPizza) pizza1;

        // 培根克数
        System.out.print("请输入培根的克数: ");
        double weight = in.nextDouble();
        baconPizza.setWeight(weight);

        // 输入大小
        System.out.print("请输入匹萨的大小: ");
        int size = in.nextInt();
        baconPizza.setSize(size);

        // 输入价格
        System.out.print("请输入匹萨的价格: ");
        double price = in.nextDouble();
        baconPizza.setPrice(price);

        // 打印
        System.out.println(baconPizza.show());
    }

    private static void printFruitPizza(String name) {
        Scanner in = new Scanner(System.in);

        // 输入水果
        System.out.print("请输入你想要加入的水果: ");
        String fruits = in.next();

        // 输入大小
        System.out.print("请输入匹萨的大小: ");
        int size = in.nextInt();

        // 输入价格
        System.out.print("请输入匹萨的价格: ");
        double price = in.nextDouble();

        FruitPizza fruitPizza = new FruitPizza(size,price,name,fruits);

        // 打印
        System.out.println(fruitPizza.show());

    }
}
