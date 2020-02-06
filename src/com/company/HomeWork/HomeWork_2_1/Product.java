package com.company.HomeWork.HomeWork_2_1;


class Product implements Comparable<Product> {
    String name;
    int price;

    @Override
    public int compareTo(Product o) {
        return this.price - o.price;
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
//        return "Наименование: " + name + "\n" + "Цена: " + price + "р.";
        return String.format("%s" + " за %d р.", name, price);
    }
}

