package com.bosiy;

public class Billboard {

    public static void main(String[] args) {
        int finalPrice = billboard("Maxim", 30);
        System.out.println(finalPrice);
    }

    public static int billboard(String name, int price) {
        int finalPrice = 0;

        for (int i = 0; i < name.length(); i++) {
            finalPrice = price + finalPrice;
        }

        return finalPrice;
    }
}
