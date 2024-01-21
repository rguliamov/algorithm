package org.example.leetcode;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        MergeTwoSortedLists solution = new MergeTwoSortedLists();

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode pointer1 = list1;
        ListNode pointer2 = list2;
        ListNode result = null;
        ListNode current = null;

        if (pointer1 == null && pointer2 == null) {
            return null;
        } else if (pointer1 == null) {
            result = new ListNode(pointer2.val);
            current = result;
            pointer2 = pointer2.next;
        } else if (pointer2 == null) {
            result = new ListNode(pointer1.val);
            current = result;
            pointer1 = pointer1.next;
        } else {
            if (pointer1.val < pointer2.val) {
                result = new ListNode(pointer1.val);
                pointer1 = pointer1.next;
            } else {
                result = new ListNode(pointer2.val);
                pointer2 = pointer2.next;
            }
            current = result;
        }

        while (pointer1 != null && pointer2 != null) {
            if (pointer1.val < pointer2.val) {
                current.next = new ListNode(pointer1.val);
                pointer1 = pointer1.next;
            } else {
                current.next = new ListNode(pointer2.val);
                pointer2 = pointer2.next;
            }

            current = current.next;
        }

        while (pointer1 != null) {
            current.next = new ListNode(pointer1.val);
            current = current.next;
            pointer1 = pointer1.next;
        }

        while (pointer2 != null) {
            current.next = new ListNode(pointer2.val);
            current = current.next;
            pointer2 = pointer2.next;
        }

        return result;
    }

    public class ListNode {
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
}
