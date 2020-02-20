package com.gomezrondon.springincontainer.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class Controller {

    @GetMapping("/time")
    public String justATest(){
        return LocalDateTime.now().toString();
    }

}