package com.bosiy;

//Создай класс "Книга" (Book) с приватным полем для названия книги
// и открытым (public) методом для получения названия.
// Попробуй изменить название книги извне класса и исправь это,
// используя модификаторы доступа.

public class MainApplication {
    public static void main(String[] args) {
        Book newName = new Book("Shine");
        newName.allInfo();
        newName.bookName = "New book";
        newName.allInfo();
    }
}
