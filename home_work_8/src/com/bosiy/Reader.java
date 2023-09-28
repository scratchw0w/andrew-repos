package com.bosiy;

public class Reader {
    private String fullName;

    private int numberOfTicket;

    private String faculty;

    private String dataOfBirthday;

    private double phoneNumber;

    public Reader(String fullName,
                  int numberOfTicket,
                  String faculty,
                  String dataOfBirthday,
                  double phoneNumber) {

        this.fullName = fullName;
        this.numberOfTicket = numberOfTicket;
        this.faculty = faculty;
        this.dataOfBirthday = dataOfBirthday;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int numberOfBook) {
        System.out.println("Петров В. В. взял " + numberOfBook + " книги\n");
    }

    public void takeBook(String bookName) {
        System.out.println("Петров В. В. взял книги: '" + bookName + "' \n");
    }

    public void takeBook(Book[] books) {

        String allTitles = "";

        for (int i = 0; i < books.length; i++) {
            Book currentBook = books[i];
            if (books.length - 1 == i) {
                allTitles = allTitles + currentBook.getTitle();
            } else {
                allTitles = allTitles + currentBook.getTitle() + ", ";
            }
        }
        System.out.println("Петров В. В. взял книги: " + allTitles + "\n");
    }

    public void returBook(int numberOfBook) {
        System.out.println("Петров В. В. вернул " + numberOfBook + " книги\n");
    }

    public void returnBook(String bookName) {
        System.out.println("Петров В. В. вернул книги: '" + bookName + "' \n");
    }

    public void returnBook(Book[] books) {

        String allTitles = "";

        for (int i = 0; i < books.length; i++) {
            if (books.length - 1 == i) {
                allTitles = allTitles + books[i].getTitle();
            } else {
                allTitles = allTitles + books[i].getTitle() + ", ";
            }
        }
        System.out.println("Петров В. В. вернул книги: " + allTitles + "\n");
    }
}
