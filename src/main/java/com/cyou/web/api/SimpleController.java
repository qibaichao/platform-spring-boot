package com.cyou.web.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
 
    @RequestMapping(value ="/hello", method = RequestMethod.GET)
    public String hello(){
        return "hello world";
    }
 
}