package com.ytc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ytc.dao")  //读取dao接口
public class SpringbootWebmasterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebmasterApplication.class, args);
    }

}
