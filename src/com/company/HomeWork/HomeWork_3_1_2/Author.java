package com.company.HomeWork.HomeWork_3_1_2;


public class Author {
    String firstName;
    String lastName;
    int year;


    public Author(String firstName, String lastName, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;

    }

    @Override
    public String toString() {
        return "\n" + "Имя - " + firstName + "\n" + "Фамилия - " + lastName + "\n" + "Год рождения - " + year;
    }
}
