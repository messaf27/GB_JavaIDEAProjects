package org.example;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Product> products = new ArrayList<>();
    public Basket() {
    }

    public void takeProduct(Product p)
    {
        this.products.add(p);
    }
    @Override
    public String toString(){
        int index = 0;
        StringBuilder out = new StringBuilder();
        for (Product product: this.products) {
            index++;
            out.append(String.format("[%d] ", index) + product.toString() + "\n");
        }
        return  out.toString();
    }
}
