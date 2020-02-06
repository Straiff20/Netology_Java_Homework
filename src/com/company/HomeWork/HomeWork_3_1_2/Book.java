package com.company.HomeWork.HomeWork_3_1_2;

public class Book {
    String name;
    Author author;
    int year;

    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "\n" + "Название книги - " + name + "\n" + "Автор: " + author + "\n" + "Написана - " + year;
    }
}
