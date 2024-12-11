package com.example.customerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class CustomerServiceApplication {

    private static final Logger logger = LoggerFactory.getLogger(CustomerServiceApplication.class);

    public static void main(String[] args) {
        logger.info("Iniciando la aplicación ...");
        SpringApplication.run(CustomerServiceApplication.class, args);
        logger.info("Aplicación iniciada correctamente.");
    }
}
