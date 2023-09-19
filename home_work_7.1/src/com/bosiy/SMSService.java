package com.bosiy;

public class SMSService extends MessagingService {

    @Override
    public void sendMessage(String message) {
        System.out.println("Your message: '" + message + "' was sent by SMS.\n");
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Your message: '" + message + "' by SMS.\n");
    }
}
