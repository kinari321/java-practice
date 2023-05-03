package com.example.helloworld;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

@SpringBootApplication
public class HelloWorldApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
        HelloController helloController = new HelloController();
        System.out.println(helloController.sayCurrentTime());
    }
}
