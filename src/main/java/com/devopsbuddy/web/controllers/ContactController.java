package com.devopsbuddy.web.controllers;

import com.devopsbuddy.backend.service.EmailService;
import com.devopsbuddy.web.domain.frontend.FeedBackProjo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by MahfuzCSE'11 on 18-Sep-16.
 */
@Controller
public class ContactController {

    private static final Logger LOG = LoggerFactory.getLogger(ContactController.class);

    public static final String FEEDBACK_MODEL_KEY = "feedback";

    private static final String CONTACT_US_VIEW_NAME = "contact/contact";

    @Autowired
    private EmailService emailService;


    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String conatctGet(ModelMap modelMap) {

        FeedBackProjo feedBackProjo = new FeedBackProjo();
        modelMap.addAttribute(ContactController.FEEDBACK_MODEL_KEY, feedBackProjo);
        return ContactController.CONTACT_US_VIEW_NAME;
    }

    @RequestMapping(value = "/contact", method = RequestMethod.POST)
    public String conatctGet(@ModelAttribute(FEEDBACK_MODEL_KEY) FeedBackProjo feedBackProjo) {

        LOG.debug("Feed Back Pojo Contact:{}", feedBackProjo);
        emailService.sendFeedbackEmail(feedBackProjo);
        return ContactController.CONTACT_US_VIEW_NAME;
    }
}
