package com.company.shop;

import java.util.ArrayList;

public class Categories {
    private String nameCategories;
    private ArrayList<Product>products;

    public Categories(String nameCategories, ArrayList<Product> products) {
        this.nameCategories = nameCategories;
        this.products = products;
    }

    public String getNameCategories() {
        return nameCategories;
    }

    public void setNameCategories(String nameCategories) {
        this.nameCategories = nameCategories;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Categories that = (Categories) o;

        if (!nameCategories.equals(that.nameCategories)) return false;
        return products.equals(that.products);
    }

    @Override
    public int hashCode() {
        int result = nameCategories.hashCode();
        result = 31 * result + products.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "выберите товара"+"\n"+
                nameCategories+"\n"+
                products+"\n";

    }
}
