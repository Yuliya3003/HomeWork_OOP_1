package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Product>> catalog = new ArrayList<>();
        Product laptop = new Product("Laptop", 1200.0, 4.5);
        Product keypad = new Product("Keypad", 130.0, 4.9);
        Product book = new Product("Book", 25.0, 4.8);

        Category electronics = new Category("Electronics");
        electronics.addProduct(laptop);
        electronics.addProduct(keypad);

        Category books = new Category("Books");
        books.addProduct(book);

        catalog.add(electronics.getProducts());
        catalog.add(books.getProducts());

        System.out.println(catalog);

        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");

        user1.getBasket().addProduct(laptop, electronics);
        user2.getBasket().addProduct(keypad,electronics);

        System.out.println(catalog);
        user1.printAllBuys();
        user2.printAllBuys();
    }
}