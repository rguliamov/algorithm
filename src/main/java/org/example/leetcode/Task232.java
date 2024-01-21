package org.example.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Task232 {

    public static void main(String[] args) {
        int x = 10;
        MyQueue myQueue = new Task232().new MyQueue();

        myQueue.push(10);
        myQueue.push(11);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.empty());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.empty());
    }

    class MyQueue {

        private final Deque<Integer> currentStack;
        private final Deque<Integer> emptyStack;

        public MyQueue() {
            currentStack = new ArrayDeque<>();
            emptyStack = new ArrayDeque<>();
        }

        public void push(int x) {
            currentStack.push(x);
        }

        public int pop() {
            while (!currentStack.isEmpty()) {
                emptyStack.push(currentStack.pop());
            }

            int result = emptyStack.pop();

            while (!emptyStack.isEmpty()) {
                currentStack.push(emptyStack.pop());
            }

            return result;
        }

        public int peek() {
            while (!currentStack.isEmpty()) {
                emptyStack.push(currentStack.pop());
            }

            int result = emptyStack.peek();

            while (!emptyStack.isEmpty()) {
                currentStack.push(emptyStack.pop());
            }

            return result;
        }

        public boolean empty() {
            return currentStack.isEmpty();
        }
    }
}
