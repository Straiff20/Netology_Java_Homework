package com.company.HomeWork.HomeWork_3_4_1.SomePeople;

import com.company.HomeWork.HomeWork_3_4_1.Duties.Administrator;
import com.company.HomeWork.HomeWork_3_4_1.Duties.Librarian;
import com.company.HomeWork.HomeWork_3_4_1.Duties.Reader;

public class LibraryWorker implements Administrator, Librarian {
    @Override
    public void findBook() {
        System.out.println("Ищет книгу");
    }

    @Override
    public void giveBook(Reader reader) {
        System.out.println("Выдает книгу");
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.println("Сообщает о просроченном сроке");
    }

    @Override
    public void orderBook() {
        System.out.println("Заказывает книгу");
    }
}
