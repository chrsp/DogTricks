package com.holografix.dogtricks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.holografix.dogtricks", "com.holografix.dogtricks.resolver"})
public class DogTricksApplication {

    public static void main(String[] args) {
        SpringApplication.run(DogTricksApplication.class, args);
    }
}