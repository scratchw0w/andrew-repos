package com.bosiy;

// Task 1
//Создать класс "Сотрудник" (Employee) с полями для имени, фамилии, возраста и зарплаты.
// Реализовать геттеры и сеттеры для этих полей,
// а также метод для вывода информации о сотруднике на экран.

public class MainApplication {
    public static void main(String[] args) {
        Employee andrew = new Employee("Andrew", "Bosiy", 26, 1000);
        andrew.allInformation();
    }
}
