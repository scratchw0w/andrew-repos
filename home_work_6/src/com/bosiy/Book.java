package com.bosiy;

public class Book {
    public String bookName;

    public Book(String bookName) {
        this.bookName = bookName;
    }

    public void allInfo() {
        System.out.println("Book name: " + bookName);
    }

}
