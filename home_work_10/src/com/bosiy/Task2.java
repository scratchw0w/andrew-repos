package com.bosiy;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        String[] words = {"Machine", "Kitchen", "Chainsaw"};

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the string to start searching: " + "\n");

        String usersWord;

        usersWord = scanner.nextLine();
        System.out.println(usersWord);

        for (int i = 0; i < words.length; i++) {
            if (usersWord.equals(words[i])) {
                System.out.println("Such a string exists in this array :)");
                return;
            }
        }
        System.out.println("It's wrong word.");
    }
}
