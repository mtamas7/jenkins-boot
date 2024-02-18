package com.example.jenkinsboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JenkinsBootApplication {

    @Autowired
    private PostgresRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(JenkinsBootApplication.class, args);
    }

    @Bean
    CommandLineRunner clr() {
        return args -> {

            repository.save(new SampleEntity(1L, "Chicken"));
            repository.save(new SampleEntity(2L, "Potato"));
            repository.save(new SampleEntity(3L, "Kolbász"));
            repository.save(new SampleEntity(4L, "Csülök"));
        };
    }

}
