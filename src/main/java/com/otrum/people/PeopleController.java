package com.otrum.people;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeopleController {

    @RequestMapping
    public String helloWorld(){
        return "hello world from spring boot";
    }
}
