package com.spring.springboot.common.practise;

import com.spring.springboot.common.Page;

public class Paradise {

    public static void main(String[] args) {
        Practise practise = new Practise();
        practise.setName("活动开始");

        Page<Practise> page = new Page<>();
        Practise data = page.getData(practise);
    }
}
