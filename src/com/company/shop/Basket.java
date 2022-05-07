package com.company.shop;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Product>byproduct;

    public Basket(ArrayList<Product> byproduct) {
        this.byproduct = byproduct;
    }

    public ArrayList<Product> getByproduct() {
        return byproduct;
    }

    public void setByproduct(ArrayList<Product> byproduct) {
        this.byproduct = byproduct;
    }
}
