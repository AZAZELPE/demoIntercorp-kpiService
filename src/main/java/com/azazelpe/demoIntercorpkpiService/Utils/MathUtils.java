package com.azazelpe.demoIntercorpkpiService.Utils;

import java.util.List;

public class MathUtils {

    public static double calculateAverage(List<Integer> marks) {
        Integer sum = 0;
        if(!marks.isEmpty()) {
            for (Integer mark : marks) {
                sum += mark;
            }
            return sum.doubleValue() / marks.size();
        }
        return sum;
    }

    public static double calculateSD(List<Integer> marks) {
        Double mean = calculateAverage(marks);
        Double standardDeviation = 0.0;

        for (Integer mark : marks) {
            standardDeviation += Math.pow(mark - mean, 2);
        }
        return Math.sqrt(standardDeviation/marks.size());

    }

}
