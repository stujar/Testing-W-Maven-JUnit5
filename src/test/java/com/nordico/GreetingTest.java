package com.nordico;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
    Author: jalnor
    Date: 7/9/2021 9:44 PM
    Project: com.nordico
*/
class GreetingTest {

    @Test
    void helloWorld() {
        Greeting greeting = new Greeting();
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        Greeting greeting = new Greeting();
        System.out.println(greeting.helloWorld("Jarrod"));
    }
}