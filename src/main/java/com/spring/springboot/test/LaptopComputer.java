package com.spring.springboot.test;

/**
 * @author liuzheng
 * @since 14:15 2019/4/26
 */
public class LaptopComputer extends Computer{

    String name = "笔记本";

    @Override
    void advantage() {
        System.out.println(name +  "的优势是：便携，轻巧");
    }
}
