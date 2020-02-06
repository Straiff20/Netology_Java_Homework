package com.company.HomeWork.HomeWork_3_1_2;

public class User {
    String email;
    String name;
    Book favoriteBook;
    int age;

    public User(String email, String firstName, Book favoriteBook,  int age) {
        this.email = email;
        this.name = firstName;
        this.favoriteBook = favoriteBook;
        this.age = age;
    }

    @Override
    public String toString() {
        return "\n" + "Логин - " + email + "\n" + "Имя юзера - " + name + "\n" + "Любимая книга: " + favoriteBook + "\n" + "Возсраст юзера - " + age;
    }
}
