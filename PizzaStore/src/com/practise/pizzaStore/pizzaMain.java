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
            printFruitPizza(pizza);
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

        basicInfo(in, baconPizza);

        // 打印
        System.out.println("名称: " + baconPizza.getName());
        System.out.println("价格: " + baconPizza.getPrice() + "元");
        System.out.println("大小: " + baconPizza.getSize() + "寸");
        System.out.println("培根克数: " + baconPizza.getWeight() + "g");
    }

    private static void printFruitPizza(Pizza pizza) {
        Scanner in = new Scanner(System.in);
        pizza.setName("水果匹萨");
        FruitPizza fruitPizza = (FruitPizza) pizza;

        // 输入水果
        System.out.print("请输入你想要加入的水果: ");
        String fruits = in.next();
        fruitPizza.setFruits(fruits);

        basicInfo(in, fruitPizza);

        // 打印
        System.out.println("名称: " + fruitPizza.getName());
        System.out.println("价格: " + fruitPizza.getPrice() + "元");
        System.out.println("大小: " + fruitPizza.getSize() + "寸");
        System.out.println("配料水果: " + fruitPizza.getFruits());

    }

    private static void basicInfo(Scanner in, Pizza pizza) {
        System.out.print("请输入匹萨的大小: ");
        int size = in.nextInt();
        pizza.setSize(size);

        // 输入价格
        System.out.print("请输入匹萨的价格: ");
        double price = in.nextDouble();
        pizza.setPrice(price);
    }
}
