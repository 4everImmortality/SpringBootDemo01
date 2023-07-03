package com.wwz.springbootdemo03;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wwz.springbootdemo03.dao")
// 注解
public class SpringBootDemo03Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemo03Application.class, args);
    }

}
