package com.devopsbuddy.web.i18n;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import java.util.Locale;

/**
 * Created by MahfuzCSE'11 on 18-Sep-16.
 */
@Service
public class I18NService {
    
    private static final Logger LOG= LoggerFactory.getLogger(I18NService.class);

    @Autowired
    private MessageSource messageSource;


    public String getMessage(String messageId) {

        LOG.info("Returning Message for i18n messageId{}",messageId);
        Locale locale = LocaleContextHolder.getLocale();
        return getMessage(messageId, locale);
    }

    public String getMessage(String messageId, Locale locale) {
        return messageSource.getMessage(messageId, null, locale);
    }
}
