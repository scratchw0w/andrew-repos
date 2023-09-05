package com.bosiy;

//Task 2
//Создать класс "Банковский счет" (BankAccount)
// с полями для номера счета, баланса и владельца счета.
// Реализовать методы для внесения и снятия средств со счета,
// а также для проверки баланса.

public class MainApplication2 {
    public static void main(String[] args) {
        BankAccount person1 = new BankAccount("Andrew Bosiy", false,
                5522, 100);
        person1.allInfo();
    }

}
