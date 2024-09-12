package ru.gb.oseminar;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        HotDrink coffee = new HotDrink("Coffee", 100, 250, 80);
        HotDrink tea = new HotDrink("Tea", 50, 200, 90);
        HotDrink hotChocolate = new HotDrink("Hot Chocolate", 120, 300, 75);


        List<Product> products = new ArrayList<>();
        products.add(coffee);
        products.add(tea);
        products.add(hotChocolate);


        HotDrinkVendingMachine hotDrinkMachine = new HotDrinkVendingMachine(products);


        HotDrink product = hotDrinkMachine.getProduct("Coffee", 250, 80);
        System.out.println("Продукт найден: " + product);

}
}


