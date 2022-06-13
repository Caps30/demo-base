package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/yunxiao/test")
public class ControllerA {
    @GetMapping("/test1")
    public String test1() {
        System.out.println("test2接口");
        return "test2接口";
    }
}
