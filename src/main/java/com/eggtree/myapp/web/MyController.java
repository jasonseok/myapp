package com.eggtree.myapp.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/myapp")
public class MyController {
    @GetMapping(value = "/hello")
    public String hello(){
        return "hello";
    }
}
