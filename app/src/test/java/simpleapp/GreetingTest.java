package simpleapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    @Test
    void appHasAGreeting() {
        Greeting classUnderTest = new Greeting();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test
    void appHasAnotherGreeting() {
        Greeting classUnderTest = new Greeting();
        assertEquals(classUnderTest.getGreeting(), "Hello World!");
    }
}