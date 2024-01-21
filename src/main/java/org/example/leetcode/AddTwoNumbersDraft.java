package org.example.leetcode;

import java.util.ArrayList;

public class AddTwoNumbersDraft {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(9);
        ListNode listNode2 = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))))));

        showList(addTwoNumbers(listNode1, listNode2));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int i = listToInteger(l1) + listToInteger(l2);

        return integerToListNode(i);
    }

    public static int listToInteger(ListNode listNode) {
        int size = size(listNode);
        int base = 0;
        int result = 0;

        for (int i = 0; i < size; i++) {
            base = (int) Math.pow(10, i);
            result += listNode.val * base;

            listNode = listNode.next;
        }

        return result;
    }

    public static ListNode integerToListNode(int num) {
        int a = num % 10;
        num = num / 10;
        ListNode listNode = new ListNode();
        ArrayList<Integer> buffer = new ArrayList<>();
        buffer.add(a);

        while (num != 0) {
            a = num % 10;
            num = num / 10;

            buffer.add(a);
        }

        listNode.val = buffer.get(0);
        ListNode currentListNode = listNode;

        for (int i = 1; i < buffer.size(); i++) {
            currentListNode.next = new ListNode(buffer.get(i));
            currentListNode = currentListNode.next;
        }

        return listNode;
    }

    public static int size(ListNode listNode) {
        int size = 1;
        while ((listNode = listNode.next) != null) {
            size++;
        }

        return size;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void showList(ListNode listNode) {
        System.out.print("[");
        while (listNode != null) {
            System.out.print(listNode.val);
            System.out.print(", ");
            listNode = listNode.next;
        }
        System.out.println("]");
    }
}
