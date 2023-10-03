package com.bosiy;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String[] words = {"Machine", "Kitchen", "Chainsaw"};

        for (int index = 0; index < words.length; index++) {
            System.out.println(words[index]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the string to start searching: " + "\n");

        String usersWord = scanner.nextLine();
        System.out.println(usersWord);

        for (int index = 0; index < words.length; index++) {
            if (usersWord.equalsIgnoreCase(words[index])) {
                System.out.println("Such a string exists in this array :)");
                return;
            }
        }
        System.out.println("Such word doesn't exist.");
    }
}
