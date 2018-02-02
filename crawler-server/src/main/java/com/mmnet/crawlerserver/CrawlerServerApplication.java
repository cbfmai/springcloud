package com.mmnet.crawlerserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CrawlerServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrawlerServerApplication.class, args);
    }
}
