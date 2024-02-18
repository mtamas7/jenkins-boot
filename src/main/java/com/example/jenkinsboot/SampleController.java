package com.example.jenkinsboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SampleController {

    @Autowired
    private PostgresRepository repository;

    @GetMapping("/")
    public List<SampleEntity> welcome() {
        return repository.findAll();
    }
}
