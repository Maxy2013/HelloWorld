package com.spring.springboot.item.average;

/**
 * @author liuzheng
 * @since 14:26 2019/5/5
 */
public class School implements ComputerAverage {
    @Override
    public double average(double[] scores) {
        double sum = 0.0;
        for(int i = 0; i < scores.length; i++){
            sum += scores[i];
        }
        double average = sum/scores.length;

        return average;
    }
}
