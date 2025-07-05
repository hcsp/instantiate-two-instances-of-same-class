package com.github.hcsp;

import com.github.hcsp.pet.Cat;

public class Home {                  // Home Class
    public static Cat black;         //成员变量
    public static Cat white;        //成员变量

    public static void main(String[] args) {       //程序入口
        createTwoCats();//函数调用
        System.out.println(black);
        System.out.println(white);
    }

    public static void createTwoCats() {      // 函数声明
        // Create two new Cats named "Black" and "White"
        // then assign them to "black" and "white" static variable respectively
        // 在这里创建两个Cat实例，分别赋值给"black"和"white"静态变量，然后将它们的"name"成员变量分别设置为"Black"和"White"
        Cat cat1 = new Cat(); // 在heap中创建了一个cat对象，cat1变量在stack中存储cat对象的地址,cat1指向cat对象
        Cat cat2 = new Cat();
        cat1.name = "Black";  //为cat1指向的cat对象赋值为Black的名字
        cat2.name = "White";
        black = cat1;        // 将cat1指向的对象赋值给black变量
        white = cat2;

        // 首先题目要求创建2个cat对象，那我们就new Cat（）
        // 然后题目要求分别赋值给"black"和"white"静态变量，也就是说 black = 需要赋值的内容
        // 最后题目说将对象的"name"成员变量分别设置为"Black"和"White"，也就是说对象.name = Black / White



    }
}
