package com.spring.springboot.test;

/**
 * @author liuzheng
 * @since 14:14 2019/4/26
 */
public class DesktopComputer extends Computer {

    String name = "台式笔记本";

    @Override
    void advantage() {
        System.out.println(name +  "的优势是：价格实惠，性价比高");
    }
}
