package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HomeController {

    @RequestMapping("/mvc")
    public String index(){
        return "index";
    }
}
