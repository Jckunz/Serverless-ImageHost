package com.serverless.imagehost.imageprocessing;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImageProcessingApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImageProcessingApplication.class, args);
    }

    @Value("${spring.application.name}")
    private String appName;

}
