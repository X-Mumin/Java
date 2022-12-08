package com.mytube;

public class SomeEmailService implements EmailService{
    @Override
    public void sendEmail(User user) {
        System.out.println("Email sent!");
    }
}
