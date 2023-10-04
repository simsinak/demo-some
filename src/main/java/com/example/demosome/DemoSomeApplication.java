package com.example.demosome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSomeApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSomeApplication.class, args);
        System.out.println("B");
    }

}
