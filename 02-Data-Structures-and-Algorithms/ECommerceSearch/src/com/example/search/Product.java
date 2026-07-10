package com.example.search;

/**
 * Exercise 2: E-commerce Platform Search Function.
 * Product with attributes used for searching.
 */
public class Product {
    private int productId;
    private String productName;
    private String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public int getProductId()      { return productId; }
    public String getProductName() { return productName; }
    public String getCategory()    { return category; }

    @Override
    public String toString() {
        return "Product{id=" + productId + ", name='" + productName + "', category='" + category + "'}";
    }
}
