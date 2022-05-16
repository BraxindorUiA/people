package com.otrum.people;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeopleController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/people")
    public People greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new People(counter.incrementAndGet(), String.format(template, name));
    }
}
