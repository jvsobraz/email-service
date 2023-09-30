package com.braz.emailservice.application;

import org.springframework.beans.factory.annotation.Autowired;

import com.braz.emailservice.core.EmailSenderUseCase;

public class EmailSenderService implements EmailSenderUseCase{

    private final EmailSenderGateway emailSenderGateway;

    @Autowired
    public EmailSenderService(EmailSenderGateway emailGateway) {
        this.emailSenderGateway = emailGateway;
    }
    
    @Override
    public void sendEmail(String to, String subject, String body) {

    }
}
