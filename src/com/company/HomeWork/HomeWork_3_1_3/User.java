package com.company.HomeWork.HomeWork_3_1_3;

public class User {
    String email;
    String name;
    String surname;


    public User(String email, String name, String surname) {
        this.email = email;
        this.name = name;
        this.surname = surname;
    }


    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
