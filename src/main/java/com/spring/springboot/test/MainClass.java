package com.spring.springboot.test;

import java.util.Scanner;

/**
 * @author liuzheng
 * @since 14:42 2019/4/26
 */
public class MainClass {


    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.setTypes(new String[]{"台式机", "笔记本", "商务笔记本", "游戏本"});

        shop.showComputer();

        System.out.println("请选择电脑类型");

        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();

        shop.chooseComputer(type);
    }
}
