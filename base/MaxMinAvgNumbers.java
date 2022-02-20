/*1.0. Максимальное, минимальное и среднее значение*/
package base;

import java.util.ArrayList;
import java.util.Collections;

public class MaxMinAvgNumbers {
    public static void main(String[] args) {
        ArrayList<Double> array = new ArrayList<>();

        for (int i = 0; i <= 100; i++) {
            array.add(Math.random());
        }

        double max = Collections.max(array);
        double min = Collections.min(array);

        double avg = 0;
        if (array.size() > 0)
        {
            double sum = 0;
            for (int j = 0; j < array.size(); j++) {
                sum += array.get(j);
            }
            avg = sum / array.size();
        }

        System.out.println("Max = " + max);
        System.out.println("Avg = " + avg);
        System.out.println("Min = " + min);
    }
}