package org.example;

public class Test {
    public static void main(String[] args) {
        int[] days = {4, 4, 4, 4, 1, 4, 4, 4};

        System.out.println(bestSeries(3, days));
    }

    static int bestSeries(int goalByStepsPerDay, int[] days) { //Поиск максимальной серии.
        int countSeries = 0;
        int maxSeries = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i] >= goalByStepsPerDay) {
                countSeries++;
            } else {
                if (countSeries > maxSeries) {
                    maxSeries = countSeries;
                }
                countSeries = 0;
            }
            if (countSeries > maxSeries) {
                maxSeries = countSeries;
            }

            if (days[i] < goalByStepsPerDay) {
                countSeries = 0;
            }
        }
        return maxSeries;
    }
}
