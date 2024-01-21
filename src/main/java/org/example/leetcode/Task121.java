package org.example.leetcode;

public class Task121 {
    public static void main(String[] args) {

        Task121 task121 = new Task121();
        int i = task121.maxProfit(new int[]{3,3,5,0,0,3,1,4});
        System.out.println(i);
    }

    public int maxProfit(int[] prices) {
        int max = 0;
        int buffer = 0;
        boolean start = true;

        for (int i = 0; i < prices.length - 1; i++) {
            int diff = prices[i + 1] - prices[i];
            if (diff < 0 && start) {
                continue;
            }

            if (diff < 0) {
                if (max < buffer) {
                    max = buffer;
                }
            }
            if (buffer + diff < 0) {
                buffer = 0;
                continue;
            }
            buffer += diff;
            start = false;
        }

        return Math.max(buffer, max);
    }
}
