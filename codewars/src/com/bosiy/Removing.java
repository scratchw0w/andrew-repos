package com.bosiy;

public class Removing {
    public static void main(String[] args) {
        String[] deleteEverySecondElements = new String[]{"Keep", "Remove", "Keep", "Remove"};
        Object[] result = removeEveryOther(deleteEverySecondElements);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

//    ["Keep", "Remove", "Keep", "Remove", "Keep", ...]
//    --> ["Keep", "Keep", "Keep", ...]

    public static Object[] removeEveryOther(Object[] arr) {
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                counter++;
            }
        }

        Object[] newArray = new Object[counter];
        int currentNewArrayIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                newArray[currentNewArrayIndex++] = arr[i];
            }
        }

        return newArray;
    }
}
