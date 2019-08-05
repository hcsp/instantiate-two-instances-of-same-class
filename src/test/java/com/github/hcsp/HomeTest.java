package com.github.hcsp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeTest {
    @Test
    public void testNewCats() {
        Home.createTwoCats();
        Assertions.assertEquals("cat(black)", Home.black.toString().toLowerCase());
        Assertions.assertEquals("cat(white)", Home.white.toString().toLowerCase());
    }
}
