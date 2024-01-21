package org.example.leetcode;

public class Task125 {
    public static void main(String[] args) {
        Task125 task125 = new Task125();
        boolean isPal = task125.isPalindrome(",");
        System.out.println(isPal);
    }

    public boolean isPalindrome(String s) {
        String[] split = s.split("[^a-zA-Z0-9]");
        StringBuilder palindrome = new StringBuilder();

        for (String str: split) {
            if (!str.isBlank()) {
                palindrome.append(str.toLowerCase());
            }
        }

        if (palindrome.length() == 1) {
            return true;
        }

        int left = 0;
        int right = palindrome.length() - 1;

        while (right > left) {
            if (!(palindrome.charAt(left) == palindrome.charAt(right))) {
                break;
            }
            right--;
            left++;
        }

        return right <= left;
    }
}
