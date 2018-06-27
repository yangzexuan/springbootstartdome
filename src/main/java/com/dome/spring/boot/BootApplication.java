package com.dome.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBootApplication 注解使得成为springboot应用
 * 使用SpringApplication.run(BootApplication.class,args)的方式启动
 * 并且springboot的应用的其他类都是欺负启动类子包下面的类
 */
@SpringBootApplication
public class BootApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class,args);
    }
}
