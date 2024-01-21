package org.example.leetcode;

public class TwoPointerExample {
    public static void main(String[] args) {
        TwoPointerExample example = new TwoPointerExample();
        int min = example.minSubsequence2(new int[] {1, 2, 3, 5, 6, 7, 2, 4, 5, 1}, 14);

        System.out.println("min: " + min);
    }

    public int minSubsequence1(int[] nums, int k) {
        int min = nums.length;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum > k) {
                    System.out.println(j);
                    if (j - i + 1 < min) {
                        min = j - i + 1;
                        break;
                    }
                }
            }
        }

        return min;
    }

    public int minSubsequence2(int[] nums, int k) {
        int j = 0;
        int sum = 0;
        int min = nums.length;
        for (int i = 0; i < nums.length; i++) {
            while (j < nums.length && (sum <= k)) {
                sum += nums[j];
                j++;
            }

            if (sum > k) {
                if (j - i < min) {
                    min = j - i ;
                }
            } else {
                break;
            }
            sum = sum - nums[i];
        }

        return min;
    }
}
