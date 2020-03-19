package com.artiow.moex.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.artiow.moex.portfolio.repository")
public class PortfolioSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(PortfolioSpringApplication.class, args);
    }
}
