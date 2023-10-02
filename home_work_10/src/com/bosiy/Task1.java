package com.bosiy;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int[] value = {2, 7, 3, 12, 8, 15, 1};

        for (int i = 0; i < value.length; i++) {
            System.out.print(value[i] + "; ");
        }

        int countOfEven = 0;
        int countOfOdd = 0;

        for (int i = 0; i < value.length; i++) {
            if (value[i] % 2 == 0) {
                countOfEven++;
            } else {
                countOfOdd++;
            }
        }

        System.out.println();
        System.out.print("You have even number: " + countOfEven + "; ");

        System.out.println();
        System.out.println("You have odd number: " + countOfOdd + "; ");
    }
}
