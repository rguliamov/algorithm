package org.example.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Task1624 {

    public static void main(String[] args) {
        System.out.println(new Task1624().maxLengthBetweenEqualCharacters("abca"));
    }

    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, Integer> characters = new HashMap<>();
        int max = -1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (characters.containsKey(c)) {
                max = Math.max(i - characters.get(c) - 1, max);
            } else {
                characters.put(c, i);
            }
        }

        return max;
    }
}
