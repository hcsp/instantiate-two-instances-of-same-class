package com.github.hcsp;

import com.github.hcsp.pet.Cat;
import com.sun.deploy.util.BlackList;

public class Home {
    public static Cat black;
    public static Cat white;

    public static void main(String[] args) {
        createTwoCats();
        System.out.println(black);
        System.out.println(white);
    }

    public static void createTwoCats() {
        // Create two new Cats named "Black" and "White"
        // then assign them to "black" and "white" static variable respectively
        // 在这里创建两个名字为"Black"和"White"的Cat实例，分别赋值给"black"和"white"静态变量
        Cat Black = new Cat();
        Cat White = new Cat();
        Black.name = "black";
        White.name = "white";

        black = Black;
        white = White;
    }
}
