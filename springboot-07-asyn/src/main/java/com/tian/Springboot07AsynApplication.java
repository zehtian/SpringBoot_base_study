package com.tian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAsync  //开启异步注解功能
@EnableScheduling //开启基于注解的定时任务
public class Springboot07AsynApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot07AsynApplication.class, args);
    }

}
