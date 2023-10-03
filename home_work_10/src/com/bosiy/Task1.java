package com.bosiy;

public class Task1 {
    public static void main(String[] args) {
        int[] numbersArray = {2, 7, 3, 12, 8, 15, 1};

        for (int index = 0; index < numbersArray.length; index++) {
            System.out.print(numbersArray[index] + "; ");
        }

        int countOfEven = 0;

        for (int index = 0; index < numbersArray.length; index++) {
            if (numbersArray[index] % 2 == 0) {
                countOfEven++;
            } // else {
//                countOfOdd++;
//            }
        }

        int countOfOdd = numbersArray.length - countOfEven;

        System.out.println();
        System.out.print("You have even number: " + countOfEven + "; ");

        System.out.println();
        System.out.println("You have odd number: " + countOfOdd + "; ");
    }
}
