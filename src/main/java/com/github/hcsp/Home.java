package com.github.hcsp;

import com.github.hcsp.pet.Cat;

public class Home {
    public static Cat black;                    //静态成员变量
    public static Cat white;                    //静态成员变量

    public static void main(String[] args) {     //入口
        createTwoCats();                         //方法调用
        System.out.println(black);
        System.out.println(white);
    }

    public static void createTwoCats() {         //方法声明
        Cat cat1 = new Cat();
        cat1.name = "Black";
        black = cat1;

        Cat cat2 = new Cat();
        cat2.name = "White";
        white = cat2;

        // Create two new Cats named "Black" and "White"
        // then assign them to "black" and "white" static variable respectively
        // 在这里创建两个Cat实例，分别赋值给"black"和"white"静态变量，然后将它们的"name"成员变量分别设置为"Black"和"White"
    }
}
