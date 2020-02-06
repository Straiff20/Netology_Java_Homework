package com.company.HomeWork.HomeWork_2_1_2;

public class Product implements Comparable<Product> {  // класс с возможностью сравнения внутри себя
    private String name;
    private int count;
    private int price;
    private String description;

    @Override
    public int compareTo(Product o) {  //  стравнение по цене
        return this.price - o.price;
    }

    public Product(String name, int count, int price, String description) {  //  конструктор
        this.name = name;
        this.count = count;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}' + "\r\n";
    }


}