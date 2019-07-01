package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JenkinController {

    @RequestMapping( "/jenkins" )
    public String test(){
        return "jenkins success";
    }
}
