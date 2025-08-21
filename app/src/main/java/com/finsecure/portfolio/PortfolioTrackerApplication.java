package com.finsecure.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class PortfolioTrackerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PortfolioTrackerApplication.class, args);
    }

    @GetMapping("/health")
    public String healthCheck() {
        return "Portfolio Tracker is running securely!";
    }

    @GetMapping("/portfolio")
    public String portfolio() {
        return "Sample portfolio data: {stock: 'AAPL', shares: 10, price: 150}";
    }
}
