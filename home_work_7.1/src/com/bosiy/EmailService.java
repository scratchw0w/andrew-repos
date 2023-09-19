package com.bosiy;

public class EmailService extends MessagingService {

    @Override
    public void sendMessage(String message) {
        System.out.println("Your message: '" + message + "' was sent by Email.\n");
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Your received a new message: '" + message + "' by Email.\n");
    }
}
