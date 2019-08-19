package com.guides.guide1.Controller;

import com.guides.guide1.Model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController //Short for @Controller and @ResponeBody
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting") //maps GET,Put, Post method automatically. can narrow it down
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
