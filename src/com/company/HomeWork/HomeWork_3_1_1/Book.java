package com.company.HomeWork.HomeWork_3_1_1;

public class Book {
    String name;
    String author;
    int quantity;

    public Book(String name, String author, int quantity) {  // констуктор
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

    // возвращает значение строкой
    @Override
    public String toString() {
        return "\n" + "Название книги - " + name + "\n" + "Автор - " + author + "\n" +  "Количество страниц - " + quantity;
    }
}


