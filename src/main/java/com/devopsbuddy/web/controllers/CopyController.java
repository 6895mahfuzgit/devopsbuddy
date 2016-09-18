package com.devopsbuddy.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by MahfuzCSE'11 on 18-Sep-16.
 */
@Controller
public class CopyController {

    @RequestMapping("/about")
    public String about() {

        return "copy/about";
    }
}
