package com.johnremboo.spring.aop;

import org.springframework.stereotype.Component;

/**
 * Created by Igor Orekhov on 01.05.17.
 */
@Component
public class Service {
    public void hi() {
        System.out.println("Hi");
    }

    public void bye() {
        System.out.println("Bye");
    }

    public String getValue() {
        return "Some value";
    }
}
