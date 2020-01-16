package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//负载均衡，分担响应
public class ProviderApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication2.class,args);
    }
}
