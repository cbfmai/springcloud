package com.mmnet.crawlerclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CrawlerClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrawlerClientApplication.class, args);
    }
}
