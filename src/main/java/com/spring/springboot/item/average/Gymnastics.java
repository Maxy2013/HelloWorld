package com.spring.springboot.item.average;

/**
 * @author liuzheng
 * @since 14:26 2019/5/5
 */
public class Gymnastics implements ComputerAverage {
    @Override
    public double average(double[] scores) {

        double temp;
        //计算总分
        double sum = 0.0;
        for(int i = 0; i < scores.length; i++){
            sum += scores[i];
        }

        for(int i=0;i<scores.length;i++) {
            for(int j=i+1;j<scores.length;j++) {
                if(scores[i]>scores[j]) {
                    temp = scores[i];
                    scores[i] = scores[j];
                    scores[j] = temp;
                }
            }
        }
        //最低分
        double minScore = scores[0];
        //最高分
        double maxScore = scores[scores.length - 1];
        //计算平均分
        double average = (sum - minScore - maxScore) / (scores.length - 2);

        return average;
    }
}
