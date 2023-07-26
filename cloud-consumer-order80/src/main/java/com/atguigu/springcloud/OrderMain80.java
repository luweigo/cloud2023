package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @auther zzyy
 * @create 2020-02-18 17:20
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderMain80
{
    public static void main(String[] args) {
            SpringApplication.run(OrderMain80.class, args);
    }
}
