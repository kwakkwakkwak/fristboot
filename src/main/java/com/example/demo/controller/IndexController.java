package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/api")
@RestController
public class IndexController {

    @RequestMapping("/view")
    public String index(){
        return "index";
    }

}
