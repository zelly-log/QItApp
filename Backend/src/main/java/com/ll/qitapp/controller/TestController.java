package com.ll.qitapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    // react 연동 테스트
    @GetMapping("/test")
    public String sayHello(){
        return "React Conection Test Success!";
    }

}
