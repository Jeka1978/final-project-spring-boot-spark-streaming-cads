package com.iai.cads.finalprojectspringbootsparkstreaming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FinalProjectSpringBootSparkStreamingApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                SpringApplication.run(FinalProjectSpringBootSparkStreamingApplication.class, args);
        System.out.println();
    }

}
