package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller
{
    @RequestMapping(value="/")
    public String index0(){
        return "index";
    }

    @RequestMapping(value="/index")
    public String index1(){
        return "index";
    }

    @RequestMapping(value="/login")
    public String login(){
        return "login";
    }
}
