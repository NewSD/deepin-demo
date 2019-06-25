package com.niu.deepindemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class DeepinDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeepinDemoApplication.class, args);
    }

}
