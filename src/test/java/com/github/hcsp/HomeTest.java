package com.github.hcsp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HomeTest {
    @Test
    public void testNewCats() {
        Main.createTwoCats();
        assertEquals("cat(black)", Home.black.toString().toLowerCase());
        assertEquals("cat(white)", Home.white.toString().toLowerCase());
    }
}
