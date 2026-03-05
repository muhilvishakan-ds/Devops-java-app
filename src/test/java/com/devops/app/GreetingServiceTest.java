package com.devops.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GreetingServiceTest {
    private final GreetingService service = new GreetingService();

    @Test
    void testGreetWithName() {
        assertEquals("Hello, Alice! Welcome to DevOps.", service.greet("Alice"));
    }

    @Test
    void testGreetWithNull() {
        assertEquals("Hello, World!", service.greet(null));
    }
}
