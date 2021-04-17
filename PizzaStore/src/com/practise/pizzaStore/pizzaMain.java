package com.practise.pizzaStore;

import java.util.Scanner;

public class pizzaMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请选择想到制作的匹萨: 1.培根匹萨 2.水果匹萨: ");
        int num = in.nextInt();
        String name = "";
        Pizza pizza;

        switch (num) {
            case 1:
                pizza = PizzaStore.getPizza(1);
                System.out.println(pizza.show());
                break;
            case 2:
                pizza = PizzaStore.getPizza(2);
                System.out.println(pizza.show());
                break;
            default:
                System.out.println("请输入正确的选项");
                System.exit(0);
        }
    }
}