package com.example.demo.controllers;

import com.example.demo.resource.GreetingController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingControllerTest {

    @Test
    public void greetingWithName() {
        GreetingController greetingController = new GreetingController();
        String name = "Ivan";
        String expectedGreeting = String.format("Hello, %s!", name);
        long expectedId = 1L;

        assertEquals(expectedId, greetingController.greeting(name).getId());
        assertEquals(expectedGreeting, greetingController.greeting(name).getContent());
    }
    @Test
    public void greetingWithoutName() {
        GreetingController greetingController = new GreetingController();
        String expectedGreeting = "Hello, World!";
        long expectedId = 1L;

        assertEquals(expectedId, greetingController.greeting("World").getId());
        assertEquals(expectedGreeting, greetingController.greeting("World").getContent());
    }
}