package com.example.springapprunnerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SpringApprunnerDemoApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(SpringApprunnerDemoApplication.class, args);
    }
    
}