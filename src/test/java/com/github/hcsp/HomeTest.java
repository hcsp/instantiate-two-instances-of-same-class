package com.github.hcsp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void testNewCats() {
        Main.createTwoCats();
        assertEquals("cat(black)", Main.black.toString().toLowerCase());
        assertEquals("cat(white)", Main.white.toString().toLowerCase());
    }
}
