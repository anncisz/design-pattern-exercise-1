package main;

import pizza.*;

public class Main {
    public static void main(String[] args) {

        PizzaFactory pizzaFactory = new PizzaFactory();

        Pizza pizza1 = pizzaFactory.create(PizzaType.MARGHERITA);

        System.out.println(pizza1.getComponents());
        System.out.println(pizza1.getCost());

        Pizza pizza2 = pizzaFactory.create(PizzaType.MARINARA);

        System.out.println(pizza2.getComponents());
        System.out.println(pizza2.getCost());
    }

}
