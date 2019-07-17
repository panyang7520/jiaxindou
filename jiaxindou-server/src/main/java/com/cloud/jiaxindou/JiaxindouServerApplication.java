package com.cloud.jiaxindou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class JiaxindouServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(JiaxindouServerApplication.class, args);
    }

}
