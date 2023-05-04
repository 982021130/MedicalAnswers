package com.wmh.medicalanswers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("more")
public class More {
    @GetMapping("message")
    public void getMessage(){
        System.out.printf("111");
        return;
    }

}
