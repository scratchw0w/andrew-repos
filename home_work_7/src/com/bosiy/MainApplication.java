package com.bosiy;

public class MainApplication {
    public static void main(String[] args) {
        Book firstBook = new Book("The Shinning");
        Book secondBook = new Book("The Shinning","S.King");
        Book thirdBook = new Book("The Shinning","S.King", 1977);
        thirdBook.allInfoThirdAttribute();
        thirdBook.setYearOfPublishing(0);
        thirdBook.allInfoThirdAttribute();
    }
}
