package com.bosiy;

public class Task3 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = array.length - 1; i >= 0; i--) {
//            System.out.println(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = array.length - i;
            System.out.println(array[i]);
        }
    }
}
