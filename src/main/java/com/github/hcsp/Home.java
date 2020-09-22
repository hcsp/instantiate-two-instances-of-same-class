package com.github.hcsp;

import com.github.hcsp.pet.Cat;

public class Home {
    public static Cat black;
    public static Cat white;

    public static void main(String[] args) {
        createTwoCats();
        System.out.println(black);
        System.out.println(white);
    }

    public static void createTwoCats() {
        black = new Cat();
        white = new Cat();
        black.name = "Black";
        white.name = "White";
    }
}
