package org.example;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(isValid("]"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("({)}"));
        System.out.println(isValid("([})"));
    }

    public static boolean isValid(String s) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c: s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                deque.push(c);
            }

            if ((c == ')'|| c == ']' || c == '}')) {
                if (deque.isEmpty()) {
                    return false;
                }

                if (c == ')' && deque.peek() != '(') {
                    return false;
                }
                if (c == ']' && deque.peek() != '[') {
                    return false;
                }
                if (c == '}' && deque.peek() != '{') {
                    return false;
                }

                deque.pop();
            }
        }

        return deque.isEmpty();
    }
}