package com.bosiy;

public class ThirdApplication {
    public static void main(String[] args) {

        int[] array = {-5, -2, 0, 5, 10};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "; ");
        }

        for (int i = 0; i < array.length - 1; i++) {
            if(!(array[i] < array[i + 1] )) {
                System.out.println("Array is not monotone.");
                return;
            }
        }
        System.out.println("Array is monotone.");
    }
}
