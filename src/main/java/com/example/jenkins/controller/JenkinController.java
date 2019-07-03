package com.example.jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class JenkinController {

    @RequestMapping(value = "/jenkins",method = RequestMethod.GET)
    @ResponseBody
    public String test(){
        return "hello,jenkins init success";
    }
}
