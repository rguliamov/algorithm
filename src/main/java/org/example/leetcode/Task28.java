package org.example.leetcode;

public class Task28 {

    public static void main(String[] args) {
        int i = new Task28().strStr("1adbutsad", "sad");

        System.out.println(i);
    }

    public int strStr(String haystack, String needle) {
        int j = 0;

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                while (j < needle.length() && (i + j) < haystack.length()) {
                    if (haystack.charAt(i + j) == needle.charAt(j)) {
                        j++;
                    } else {
                        break;
                    }
                }

                if (j == needle.length()) {
                    return i;
                } else {
                    j = 0;
                }
            }
        }
        return -1;
    }
}
