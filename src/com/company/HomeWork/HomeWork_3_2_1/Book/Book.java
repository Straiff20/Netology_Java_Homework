package com.company.HomeWork.HomeWork_3_2_1.Book;

public class Book {

    private String title;
    private StatusEnum status;

    public Book(String title) {
        this.title = title;
        this.status = StatusEnum.AVAILABLE;
    }

    public void setTitle(String title) {this.title = title;}

    public void setStatus(StatusEnum status) {this.status = status;}

    public String getTitle() {return title;}

    public StatusEnum getStatus() {return status;}
}
