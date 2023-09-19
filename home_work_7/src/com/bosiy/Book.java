package com.bosiy;

public class Book {
    private String title;
    private String writer;
    private int yearOfPublishing;

    public Book(String title) {
        this.title = title;
    }

    public Book(String title, String writer) {
        this.title = title;
        this.writer = writer;
    }

    public Book(String title, String writer, int yearOfPublishing) {
        this.title = title;
        this.writer = writer;
        this.yearOfPublishing = yearOfPublishing;
    }

    public void printAllInfo() {
        System.out.println("Name of book: " + this.title + "\nWriter: " + this.writer +
                "\nYear of publishing: " + this.yearOfPublishing + "\n");
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        this.yearOfPublishing = yearOfPublishing;
    }
}
