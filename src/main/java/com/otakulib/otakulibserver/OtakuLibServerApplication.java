package com.otakulib.otakulibserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.otakulib.otakulibserver.model.dao")
public class OtakuLibServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OtakuLibServerApplication.class, args);
    }

}
