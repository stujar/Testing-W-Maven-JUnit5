package com.nordico;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
    Author: jalnor
    Date: 7/9/2021 9:44 PM
    Project: com.nordico
*/
class GreetingTest {

    private Greeting greeting;

    @BeforeEach
    void setUp() {
        System.out.println("Before each...");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld("Jarrod"));
    }
}