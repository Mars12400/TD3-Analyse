package com.iutblagnac.r303trace;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    @Test
    public void testHello() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello World!", helloWorld.hello());
    }
}
