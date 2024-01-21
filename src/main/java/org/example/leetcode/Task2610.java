package org.example.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task2610 {
    public static void main(String[] args) {
        System.out.println(new Task2610().findMatrix(new int[]{2,1,1,2, 3, 3, 3,}));
    }

    public List<List<Integer>> findMatrix(int[] nums) {
        Set<Integer> integers = new HashSet<>();
        List<Integer> positions = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (integers.contains(nums[i])) {
                positions.add(i);
            } else {
                integers.add(nums[i]);
            }
        }

        result.add(List.copyOf(integers));

        while (!positions.isEmpty()) {
            integers.clear();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < positions.size(); i++) {
                if (integers.contains(nums[positions.get(i)])) {

                } else {
                    integers.add(nums[positions.get(i)]);
                    temp.add(positions.get(i));
                }
            }

            result.add(List.copyOf(integers));
            positions.removeAll(temp);
        }

        return result;
    }
}
