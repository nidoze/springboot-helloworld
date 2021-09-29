package com.walkon.controller;

import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ResponseBody
    public String hello(){
        return "Hello World";
    }
}