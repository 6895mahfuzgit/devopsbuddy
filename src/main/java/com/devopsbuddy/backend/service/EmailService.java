package com.devopsbuddy.backend.service;

import com.devopsbuddy.web.domain.frontend.FeedBackProjo;
import org.springframework.mail.SimpleMailMessage;

/**
 * Created by MahfuzCSE'11 on 19-Sep-16.
 */
public interface EmailService {

    public void sendFeedbackEmail(FeedBackProjo feedBackProjo);

    public void sendGenericEmailMessage(SimpleMailMessage message);
}
