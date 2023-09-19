package com.bosiy;

public class MainApplication {
    public static void main(String[] args) {
        Book firstBook = new Book("The City of Dead");
        Book secondBook = new Book("The Pet Cemetery","S.King");
        Book thirdBook = new Book("The Shinning","S.King", 1977);
        thirdBook.printAllInfo();
        thirdBook.setYearOfPublishing(0);
        thirdBook.printAllInfo();
    }
}
