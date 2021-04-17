package com.practise.pizzaStore;

public class PizzaStore {
    // 方法： 提供Pizza
    public static Pizza getPizza(String pizzaName) {
//        pizzaName = pizzaName.toLowerCase();
        Pizza pizza = null;

//        if ("bacon".equals(pizzaName)) { // pizzaName.equals("bacon")容易引发空指针异常
//            pizza = new BaconPizza();
//        }

        switch (pizzaName) {
            case "bacon":
                pizza = new BaconPizza();
                break;
            case "fruit":
                pizza = new FruitPizza();
                break;
        }
        return pizza;
    }
}
