package com.bosiy;

// Create a method that takes as input a name, city, and state to welcome a person.
// Note that name will be an array consisting of one or more values
// that should be joined together
// with one space between each, and the length of the name array in test cases will vary.

//This example will return the string
// Hello, John Smith! Welcome to Phoenix, Arizona!

public class WelcomeToTheCity {

    public static void main(String[] args) {

        String[] array = new String[] {"Whole", "Sperm"};
        System.out.println(sayHello(array, "Phoenix", "Arizona"));
    }

    public static String sayHello(String[] name, String city, String state) {
        String fullName = "";

        for (int i = 0; i < name.length; i++) {
            if (name.length - 1 == i) {
                fullName = fullName + name[i];
            }
            else {
                fullName = fullName + name[i] + " ";
            }
        }
        return "Hello, " + fullName + "! Welcome to " + city + ", " + state + "!";
    }
}