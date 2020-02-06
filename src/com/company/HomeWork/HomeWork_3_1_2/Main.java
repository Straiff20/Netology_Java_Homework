package com.company.HomeWork.HomeWork_3_1_2;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Ник", "Перумов", 1960);
        Book book = new Book("Земля без радости", author, 1998);
        User user = new User("123@mail.ru", "Ilya", book, 29);

        System.out.println(author);
        System.out.println(book);
        System.out.println(user);
    }
}
