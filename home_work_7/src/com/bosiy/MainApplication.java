package com.bosiy;

// Создайте класс Book, представляющий книгу. +
// Класс должен иметь атрибуты, такие как название, автор, год издания. +
// Реализуйте методы для получения и установки значений атрибутов. +
// И конструкторы для 1, 2, 3 аргументов +

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
