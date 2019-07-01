package com.gitflowexample.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class feature_controller {
@RequestMapping("/hello")
    public @ResponseBody  String helloword ()
    {
        return "helloword!";
    }
}
