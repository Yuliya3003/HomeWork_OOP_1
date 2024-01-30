package org.example;

public class User {
    private String login;
    private String password;
    private Basket basket;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.basket = new Basket();
    }

    public Basket getBasket() {
        return basket;
    }

    public void printAllBuys(){
        System.out.println("User: " + login);
        System.out.println("Список покупок:");
        for (Product product : basket.getProductBuy()) {
            System.out.println("- " + product);
        }
        System.out.println("Total: $" + basket.calculateTotalCost());
        System.out.println();
    }
    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", basket=" + basket +
                '}';
    }
}
