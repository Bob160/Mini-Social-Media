package com.example.newfbkclone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages= "com")
public class NewFbkCloneApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewFbkCloneApplication.class, args);
    }

}
