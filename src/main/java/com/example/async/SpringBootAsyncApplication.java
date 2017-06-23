package com.example.async;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@MapperScan("com.example.async.domain.infrastructure.model")
@EnableAsync
public class SpringBootAsyncApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAsyncApplication.class, args);
    }
}
