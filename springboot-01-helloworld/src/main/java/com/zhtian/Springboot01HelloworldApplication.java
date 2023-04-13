package com.zhtian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//本质上还是一个Spring组件（@Component）
@SpringBootApplication
public class Springboot01HelloworldApplication {
    //程序入口
    public static void main(String[] args) {
        SpringApplication.run(Springboot01HelloworldApplication.class, args);
    }

}
