package com.patpaw;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@Slf4j
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        log.info("Magic Ball");

        SpringApplication.run(Main.class, args);
    }
}
