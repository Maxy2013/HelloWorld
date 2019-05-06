package com.spring.springboot.test;

/**
 * @author liuzheng
 * @since 14:18 2019/4/26
 */
public class GameLaptop extends LaptopComputer {

    String name = "游戏本";

    @Override
    void advantage() {
        System.out.println(name +  "的优势是：高配置、性能强、大型游戏不卡顿");
    }
}
