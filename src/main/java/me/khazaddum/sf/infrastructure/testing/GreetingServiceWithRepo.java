package me.khazaddum.sf.infrastructure.testing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class GreetingServiceWithRepo {

    @Autowired
    private GreetingRepository greetingRepository;

    public String greet(String name) {
        String greeting = greetingRepository.getGreeting();
        return greeting + name;
    }

}
