package com.company.HomeWork.HomeWork_3_2_1;

import com.company.HomeWork.HomeWork_3_2_1.Book.Book;
import com.company.HomeWork.HomeWork_3_2_1.Book.StatusEnum;
import com.company.HomeWork.HomeWork_3_2_1.Mover.*;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("Властелин колец");

        FromAvailableStatusMover fromAvailableStatusMover = new FromAvailableStatusMover();
        FromArchivedStatusMover fromArchivedStatusMover = new FromArchivedStatusMover();
        FromBorrowedStatusMover fromBorrowedStatusMover = new FromBorrowedStatusMover();
        FromOverduedStatusMover fromOverduedStatusMover = new FromOverduedStatusMover();

        System.out.println(book.getStatus());

        fromAvailableStatusMover.moveToStatus(book, StatusEnum.BORROWED);
        System.out.println(book.getStatus());

        fromBorrowedStatusMover.moveToStatus(book, StatusEnum.ARCHIVED);
        System.out.println(book.getStatus());

        fromArchivedStatusMover.moveToStatus(book, StatusEnum.AVAILABLE);
        System.out.println(book.getStatus());

        fromAvailableStatusMover.moveToStatus(book, StatusEnum.OVERDUED);
        System.out.println();

        /*BookMover[] movers = {fromAvailableStatusMover, fromArchivedStatusMover, fromBorrowedStatusMover, fromOverduedStatusMover};
        checkMoves(movers, book);
    }

    private static void checkMoves(BookMover[] movers, Book book) {
        for (BookMover bookMover: movers) {
            System.out.println("before " + book.getStatus());
            bookMover.moveToStatus(book, StatusEnum.BORROWED);
            System.out.println("after " + book.getStatus());
        }
    */}
}
