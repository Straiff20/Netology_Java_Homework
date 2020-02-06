package com.company.HomeWork.HomeWork_3_4_1.SomePeople;

import com.company.HomeWork.HomeWork_3_4_1.Duties.Administrator;
import com.company.HomeWork.HomeWork_3_4_1.Duties.Librarian;
import com.company.HomeWork.HomeWork_3_4_1.Duties.Reader;

public class User implements Reader, Librarian {
    @Override
    public void takeBook(Administrator administrator) {
        System.out.println("Берет книгу");
    }

    @Override
    public void returnBook() {
        System.out.println("Возвращает книгу");
    }

    @Override
    public void orderBook() {
        System.out.println("Заказывает книгу");
    }
}

