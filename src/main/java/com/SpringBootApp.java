package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
@EnableAutoConfiguration
//@SpringBootApplication
public class SpringBootApp {

    @RequestMapping("/")
    String home() {
        return "I want to be powerful!!";
    }

  
    public static void main(String[] args) throws Exception {
        
         SpringApplication.run(SpringBootApp.class,args);
         System.out.println("Hello world");
        
    }
}
