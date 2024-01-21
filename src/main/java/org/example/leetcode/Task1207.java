package org.example.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task1207 {
    public static void main(String[] args) {
        boolean b = new Task1207().uniqueOccurrences(new int[]{1,2});
        System.out.println(b);
    }

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> countOfOccurrences = new HashMap<>();

        for (int i : arr) {
            if (countOfOccurrences.containsKey(i)) {
                countOfOccurrences.put(i, countOfOccurrences.get(i) + 1);
            } else {
                countOfOccurrences.put(i, 1);
            }
        }

        Set<Integer> set = new HashSet<>();

        return countOfOccurrences.values().stream().allMatch(set::add);
    }
}
