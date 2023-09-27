package com.bosiy;

public class MainApplication {
    public static void main(String[] args) {

        Phone first = new Phone("12", 120);
        Phone second = new Phone("13", 160);
        Phone third = new Phone("14", 20);

        Phone[] allPhones = {first, second, third};

        int totalAmount = 0;
        Phone phone = null;

        for (int i = 0; i < allPhones.length; i++) {
            totalAmount = allPhones[i].getAmount() + totalAmount;
        }

        for (int i = 0; i < allPhones.length; i++) {
            if (allPhones[i].getModel().equals("13")) {
                phone = allPhones[i];
            }
        }

        System.out.println(phone.allInfo());

        System.out.println(totalAmount);
    }
}
