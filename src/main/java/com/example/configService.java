package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@PropertySource(value = "classpath:configService.properties")
/*@RefreshScope*/
public class configService {



    public static void main(String[] args) {
        SpringApplication.run(configService.class,args);
       // System.out.println("NAME FETCHED FROM CONFIG SERVER : "+name);
    }
}
