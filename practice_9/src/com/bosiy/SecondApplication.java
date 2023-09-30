package com.bosiy;

public class SecondApplication {
    public static void main(String[] args) {

        int[] firstArray = {3, 1, 5, 4};

        int[] secondArray = {3, 1, 5, 4};

        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i] + "; ");
        }

        System.out.println();

        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i] + "; ");
        }

        System.out.println();

        for (int i = 0; i < firstArray.length; i++) {

            if (!(firstArray[i] == secondArray[i])) {
                System.out.println("Arrays are not equal.");
                return;
            }
        }
        System.out.println("Arrays are equal.");
    }
}
