package com.example.promoDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@ComponentScan({"com.delivery.request"})
//@SpringBootApplication
//@ComponentScan({"com.delivery.request"})
//
//@EntityScan("com.delivery.domain")
//@EnableJpaRepositories("com.delivery.repository")
@SpringBootApplication
public class PromoDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PromoDemoApplication.class, args);
    }

}
