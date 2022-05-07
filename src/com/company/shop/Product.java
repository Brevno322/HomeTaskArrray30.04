package com.company.shop;

public class Product {
    private int price;
    private int ratung;
    private String nameProduct;


    public Product(int price, int ratung, String nameProduct) {
        this.price = price;
        this.ratung = ratung;
        this.nameProduct = nameProduct;

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRatung() {
        return ratung;
    }

    public void setRatung(int ratung) {
        this.ratung = ratung;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (price != product.price) return false;
        if (ratung != product.ratung) return false;
        return nameProduct.equals(product.nameProduct);
    }

    @Override
    public int hashCode() {
        int result = price;
        result = 31 * result + ratung;
        result = 31 * result + nameProduct.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Продукция" +"\n"+
                "Цена=" + price +"\n"+
                "Рейтинг=" + ratung +"\n"+
                "Имя продукта=" + nameProduct + '\''
                ;
    }


}
