package com.spring.springboot.item.average;

/**
 * @author liuzheng
 * @since 14:34 2019/5/5
 */
public class MainClass {

    public static void main(String[] args) {
        ComputerAverage averageGym = new Gymnastics();
        double[] gymScores = {9.21, 8.53, 8.65, 9.50, 9.88, 8.76, 9.46, 9.78};
        double gymnastics = averageGym.average(gymScores);
        System.out.println("该体操选手的比赛得分是：" + gymnastics);

        ComputerAverage averageSchool = new School();
        double[] schoolScores = {80.5, 88, 98.5, 99, 78, 88, 85, 81.6, 92.5};
        double school = averageSchool.average(schoolScores);
        System.out.println("班级科目的平均成绩是：" + school);
    }
}
