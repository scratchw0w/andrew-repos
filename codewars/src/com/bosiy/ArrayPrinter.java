package com.bosiy;


public class ArrayPrinter {

    public static void main(String[] args) {
        String[] words = new String[]{"Hello", "World", "Hay"};
        System.out.println(printArray(words));

    }

    public static String printArray(Object[] array) {
        String allElements = "";

        for (int i = 0; i < array.length; i++) {
           if(array.length - 1 == i) {
               allElements = allElements + array[i];
           }
           else {
               allElements = allElements + array[i] + ",";
           }
        }

        return allElements;
    }
}
