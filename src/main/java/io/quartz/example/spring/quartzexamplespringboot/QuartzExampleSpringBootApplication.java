package io.quartz.example.spring.quartzexamplespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@Configuration
@EnableScheduling
@ComponentScan({"io.quartz.example.spring.*"})
public class QuartzExampleSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(QuartzExampleSpringBootApplication.class, args);
    }
}
