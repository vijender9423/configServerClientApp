package com.example.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping(value="/pracConfig")
public class ValuePrac {

    @Value("${name.my}")
    private  String name;

    @GetMapping
    public String bean(){
        System.out.println("NAME : " +name);
        return name;
    }
}
