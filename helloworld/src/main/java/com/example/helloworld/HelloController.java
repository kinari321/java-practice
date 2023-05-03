package com.example.helloworld;


import java.time.LocalTime;

public class HelloController {
    public String sayCurrentTime() {
        LocalTime currentTime = LocalTime.now();
        return "Hello! \nThe current local time is:" + currentTime;
    }
}
