package com.example.recycleview_ex1;

public class Product {
    private String name_product;
    private Double price_product;
    private int image_product;

    public Product(String name_product, Double price_product, int image_product) {
        this.name_product = name_product;
        this.price_product = price_product;
        this.image_product = image_product;
    }

    public String getName_product() {
        return name_product;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }

    public Double getPrice_product() {
        return price_product;
    }

    public void setPrice_product(Double price_product) {
        this.price_product = price_product;
    }

    public int getImage_product() {
        return image_product;
    }

    public void setImage_product(int image_product) {
        this.image_product = image_product;
    }
}
