package com.bosiy;

public class MessagingService {

    public void sendMessage(String message) {
        System.out.println("Your message: '" + message + "' was sent by messaging service.\n");
    }

    public void receiveMessage(String message) {
        System.out.println("Your received a new message: '" + message + "' by messaging service" +
                ".\n");
    }
}
