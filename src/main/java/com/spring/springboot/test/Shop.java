package com.spring.springboot.test;

/**
 * @author liuzheng
 * @since 14:19 2019/4/26
 */
public class Shop {

    String[] types;

    public void setTypes(String[] types){
        this.types = types;
    }

    public void showComputer(){
        System.out.println("商场中有：");
        for(int i = 0; i < types.length; i++){
            System.out.println(types[i]);
        }
    }

    public void chooseComputer(String type){
        switch (type){
            case "台式机":
                Computer computer1 = new DesktopComputer();
                computer1.advantage();
                break;
            case "笔记本":
                Computer computer2 = new LaptopComputer();
                computer2.advantage();
                break;
            case "商务笔记本":
                Computer computer3 = new BusinessLaptop();
                computer3.advantage();
                break;
            case "游戏本":
                Computer computer4 = new GameLaptop();
                computer4.advantage();
                break;
            default:
                System.out.println("没有这种电脑");
                break;
        }
    }
}
