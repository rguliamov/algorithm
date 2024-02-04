package org.example.leetcode.linked_list_tasks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Queue;

public class Task234 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(2);
        listNode.next.next.next = new ListNode(1);

        System.out.println(new Task234().isPalindrome(listNode));
    }

    public boolean isPalindrome(ListNode head) {
        Deque<Integer> queue = new ArrayDeque<>();
        Deque<Integer> stack = new ArrayDeque<>();

        ListNode listNode = head;

        while (head != null) {
            queue.add(head.val);
            head = head.next;
        }

        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }

        while (!queue.isEmpty()) {
            if (queue.pollFirst() != stack.pollFirst()) {
                return false;
            }
        }

        return true;
    }
}
