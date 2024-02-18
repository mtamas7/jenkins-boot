package com.example.jenkinsboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/")
    public String welcome() {
        return "Hello from service!";
    }
}
