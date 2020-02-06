package com.company.HomeWork.HomeWork_3_2_1.Mover;

import com.company.HomeWork.HomeWork_3_2_1.Book.Book;
import com.company.HomeWork.HomeWork_3_2_1.Book.StatusEnum;

public class FromOverduedStatusMover extends BookMover {

    @Override
    public void moveToStatus(Book book, StatusEnum requestStatus) {
        super.moveToStatus(book, requestStatus);
        if (book.getStatus() == StatusEnum.OVERDUED) {
            switch (requestStatus) {
                case AVAILABLE:
                case ARCHIVED:
                    book.setStatus(requestStatus);
                    break;
                default:
                    System.out.println("Перевод книг из статуса " + book.getStatus() + " в статус " + requestStatus + " невозможен");
                    break;
            }
        }
    }
}