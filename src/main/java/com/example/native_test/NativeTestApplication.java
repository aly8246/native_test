package com.example.native_test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.native_test.mapper")
public class NativeTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(NativeTestApplication.class, args);
    }

}
