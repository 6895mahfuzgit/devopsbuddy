package com.devopsbuddy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by MahfuzCSE'11 on 17-Sep-16.
 */
@Controller
public class HelloWorldController {

    @RequestMapping("/")
    public String index(){

        return "index";
    }

}
