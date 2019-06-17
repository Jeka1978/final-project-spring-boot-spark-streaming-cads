package com.iai.cads.finalprojectspringbootsparkstreaming;

import com.iai.cads.finalprojectspringbootsparkstreaming.spark.EtlService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FinalProjectSpringBootSparkStreamingApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(FinalProjectSpringBootSparkStreamingApplication.class, args);
        context.getBean(EtlService.class).startProcess();
    }

}
