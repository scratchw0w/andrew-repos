package com.bosiy;

public class Task2 {
    public static void main(String[] args) {

        int[] array = {2,10,3,8,5};

        if(array.length == 0) {
            return;
        }
        int minValue = array[0];
        int maxValue = array[0];

        for(int i = 0; i < array.length; i++) {
            if(maxValue < array[i]) {
                maxValue = array[i];
            }
            if (minValue > array[i]) {
                minValue = array[i];
            }
        }
        System.out.println(minValue + ", " +  maxValue);
    }
}
