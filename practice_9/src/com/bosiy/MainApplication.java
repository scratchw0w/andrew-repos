package com.bosiy;

public class MainApplication {
    public static void main(String[] args) {

        double[] value = {-2, -1, 0, 1, 3, 5, 7, 9, 12, 14};

        for (int i = 0; i < value.length; i++) {
            System.out.print(value[i] + "; ");
        }
        System.out.println();

        double sumOfValue = 0;

        for (int i = 0; i < value.length; i++) {
            sumOfValue = value[i] + sumOfValue;

        }

        double averageValue = sumOfValue / value.length;
        System.out.println(averageValue);
    }
}
