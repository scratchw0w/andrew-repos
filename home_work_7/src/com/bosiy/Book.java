package com.bosiy;

public class Book {
    private String bookName;
    private String writer;
    private int yearOfPublishing;

    public Book(String name) {
        this.bookName = name;
    }
    public void allInfoFirstAttribute() {
        System.out.println("Name of book: " + bookName + "\n");
    }
    public Book(String name, String writer) {
        this.bookName = name;
        this.writer = writer;
    }
    public void allInfoSecondAttribute() {
        System.out.println("Name of book: " + bookName + "\nWriter: " + writer + "\n");
    }
    public Book(String name, String writer, int yearOfPublishing) {
        if(yearOfPublishing <= 0) {
            System.out.println("The publication date of the book is incorrect!");
            return;
        }
        this.bookName = name;
        this.writer = writer;
        this.yearOfPublishing = yearOfPublishing;
    }
    public void allInfoThirdAttribute() {
        System.out.println("Name of book: " + bookName + "\nWriter: " + writer +
                "\nYear of publishing: " + yearOfPublishing + "\n");
    }



    public String getBookName() {
        return this.bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getWriter() {
        return this.writer;
    }
    public void setWriter(String writer) {
        this.writer = writer;
    }
    public int getYearOfPublishing() {
        return this.yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        if(yearOfPublishing <= 0) {
            System.out.println("This is the wrong date!");
            return;
        }
        this.yearOfPublishing = yearOfPublishing;
    }
}
