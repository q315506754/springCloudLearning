package com.jiangli.spring.cloud.learning.eureka.client.ribbon.resttemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
//@EnableEurekaClient
@EnableHystrix
@EnableHystrixDashboard
public class EurekaClientRibbonHystrixRestTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientRibbonHystrixRestTemplateApplication.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}