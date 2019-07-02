package com.example.jenkins.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class JenkinController {

    @RequestMapping(value = "/jenkins",method = RequestMethod.GET)
    @ResponseBody
    public JSONObject test(){
        JSONObject object = new JSONObject();
        object.put("name","hello,jenkins init success!!");
        return object;
    }
}
