package org.example;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 3}; // {1, 2, 3, *, *, *, *}
        System.out.println(new RemoveDuplicatesFromSortedArray().removeDuplicates(a));
        System.out.println(Arrays.toString(a));
    }

    public int removeDuplicates(int[] nums) {
        int j = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }
}
