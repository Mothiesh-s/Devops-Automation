package com.example.devops_pract;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {




    @GetMapping("/get")
    public  String get(){
        return "Hello Welcome to devops Learning";
    }

    @GetMapping("/content")
    public  String extract(){
        return  "Practice CICD";
    }

}
