package org.example;

import java.util.ArrayList;


public class Basket {
    private ArrayList<Product> productBuy;

    public Basket() {
        this.productBuy = new ArrayList<>();
    }

    public void addProduct(Product product, Category category){
        productBuy.add(product);
        category.removeProduct(product);
    }

    public ArrayList<Product> getProductBuy() {
        return productBuy;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "productBuy=" + productBuy +
                '}';
    }

    public double calculateTotalCost() {
        double sum = 0;
        for (Product product:getProductBuy()
             ) {
            sum += product.getPrice();
        }
        return sum;
    }
}
