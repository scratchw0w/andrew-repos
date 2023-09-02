package com.bosiy;

public class EvenOrOdd {
    public static void main(String[] args) {
        String result = even_or_odd(6);
        System.out.println(result);
    }
    //Create a function that takes an integer as an argument
//and returns "Even" for even numbers or "Odd" for odd numbers.
    public static String even_or_odd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
