package com.bosiy;

public class Stringy {

    public static void main(String[] args) {
        String answer = stringy(5);
        System.out.println(answer);
        String anotherAnswer = stringyUpdated(5);
        System.out.println(anotherAnswer);
    }
// size 6 should return :'101010'.
// size 4 should return : '1010'.

    public static String stringy(int size) {
        String value = "";

        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                value = value + 1;
            } else {
                value = value + 0;
            }
        }

        return value;
    }

    public static String stringyUpdated(int size) {
        String value = "";

        for (int i = 1; i < size + 1; i++) {
            value = value + (i % 2);
        }

        return value;
    }
}
