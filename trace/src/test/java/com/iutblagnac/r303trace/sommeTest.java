package com.iutblagnac.r303trace;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class sommeTest {
    @Test
    public void testSomme() {
        assertEquals(5, somme.somme(2, 3));
        assertEquals(-1, somme.somme(2, -3));
        assertEquals(0, somme.somme(0, 0));
        assertEquals(100, somme.somme(70, 30));
    }
}
