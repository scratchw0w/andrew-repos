package com.bosiy;

public class Task1 {
    public static void main(String[] args) {
        double[] array = {3,5,2};
        double multiply = 1;

        for (int i = 0; i < array.length; i++) {
            multiply = multiply * array[i];
        }

        System.out.println(multiply);
    }
}
