package me.khazaddum.sf.infrastructure.testing;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingServiceI {

    public String greet(String name) {
        return String.format("Hello %s", name);
    }

}
