package com.test.renyuan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.test.renyuan.mapper")
public class RenyuanApplication {

    public static void main(String[] args) {
        SpringApplication.run(RenyuanApplication.class, args);
    }

}
