package simpleapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingTest {

    Greeting classUnderTest = new Greeting();

    @Test
    void appHasAGreeting() {
        assertEquals(classUnderTest.getAnotherGreeting(), "Greetings!");
    }

    @Test
    void appHasAnotherGreeting() {
        assertEquals(classUnderTest.getGreeting(), "Hello World!");
    }
}