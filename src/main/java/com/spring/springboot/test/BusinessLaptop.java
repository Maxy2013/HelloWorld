package com.spring.springboot.test;

/**
 * @author liuzheng
 * @since 14:16 2019/4/26
 */
public class BusinessLaptop extends LaptopComputer{

    String name = "商务笔记本";

    @Override
    void advantage() {

        System.out.println(name +  "的优势是：高端大气、轻薄、续航时间长");
    }
}
