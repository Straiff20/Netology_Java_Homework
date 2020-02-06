package com.company.HomeWork.HomeWork_3_4_1.SomePeople;

import com.company.HomeWork.HomeWork_3_4_1.Duties.Administrator;
import com.company.HomeWork.HomeWork_3_4_1.Duties.Reader;
import com.company.HomeWork.HomeWork_3_4_1.Duties.Supply;

public class Supplier implements Reader, Supply {
    @Override
    public void takeBook(Administrator administrator) {
        System.out.println("Дает книгу");
    }

    @Override
    public void returnBook() {
        System.out.println("Возвращает книгу");
    }

    @Override
    public void giveBookToLibrary() {
        System.out.println("Доставляет книгу");
    }
}
