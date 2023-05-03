package com.example.jacksoncsvsample;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

@SpringBootApplication
public class JacksonCsvSampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(JacksonCsvSampleApplication.class, args);
        HelloController helloController = new HelloController();
        System.out.println(helloController.sayCurrentTime());
    }
}
