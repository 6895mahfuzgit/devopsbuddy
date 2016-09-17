package com.devopsbuddy.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by MahfuzCSE'11 on 17-Sep-16.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String home() {

        return "index";
    }
}
