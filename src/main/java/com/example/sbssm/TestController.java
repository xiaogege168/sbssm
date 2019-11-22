package com.example.sbssm;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("helloWorld")
    public String testspringboot() {
        return "HelloWorld";
    }
}