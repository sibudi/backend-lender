package com.yqg;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
//import org.springframework.kafka.annotation.EnableKafka;

/**
 * 支付服务启动类
 */
@Slf4j
@SpringBootApplication
//ahalim: Disable kafka n eureka n discovery client
//@EnableKafka
//@EnableEurekaClient
//@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
@EnableHystrixDashboard
public class PayServiceApp {

    public static void main(String[] args) {
		SpringApplication.run(PayServiceApp.class, args);
    }

}
