package com.bankproject.code.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
	@RequestMapping(value={"/"})
    public String home(){
        return "home";
    }
}