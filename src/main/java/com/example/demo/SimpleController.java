package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping
    public String get(SimpleQuery query) {
        return query.text();
    }

    @PostMapping
    public String post(@RequestBody SimpleQuery query) {
        return query.text();
    }

}
