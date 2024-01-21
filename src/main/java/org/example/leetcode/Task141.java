package org.example.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Task141 {
    public static void main(String[] args) {

    }

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        Map<ListNode, Boolean> map = new HashMap<>();
        while (head.next != null) {
            if (map.containsKey(head) && map.get(head)) {
                return true;
            }

            map.put(head, true);
            head = head.next;
        }

        return false;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
