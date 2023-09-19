package com.bosiy;

public class MainApplication {
    public static void main(String[] args) {
        MessagingService emailService = new EmailService();
        emailService.sendMessage("Welcome to mail! :)");
        emailService.receiveMessage("Hi.");
        MessagingService smsService = new SMSService();
        smsService.sendMessage("Welcome to SMS world!");
        smsService.receiveMessage("Sorry, but I love MMS :)");
    }
}
