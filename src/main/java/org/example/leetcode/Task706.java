package org.example.leetcode;

import org.example.leetcode.tree_tasks.Task559;
import org.example.yandex.algo.A;

import java.util.LinkedList;

public class Task706 {
    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();

        myHashMap.put(0, 1);
        myHashMap.put(256, 2);
        System.out.println(myHashMap.get(0));
        myHashMap.remove(256);
        System.out.println(myHashMap.get(0));
    }

    static class MyHashMap {

        private final int size = 256;
        private Node[] map;

        public MyHashMap() {

        }

        public void put(int key, int value) {
            if (map == null) {
                map = new Node[size];
            }

            int index = key % size;
            Node bucket = map[index];

            if (bucket == null) {
                bucket = new Node(key, value);
                map[index] = bucket;

                return;
            }

            Node last = bucket;
            while (bucket != null) {
                if (bucket.key == key) {
                    bucket.val = value;
                    return;
                }
                last = bucket;
                bucket = bucket.next;
            }

            last.next = new Node(key, value);
        }

        public int get(int key) {
            if (map == null) {
                return -1;
            }

            int index = key % size;
            Node bucket = map[index];
            if (bucket == null) {
                return -1;
            }

            while (bucket != null) {
                if (bucket.key == key) {
                    return bucket.val;
                }
                bucket = bucket.next;
            }

            return  -1;
        }

        public void remove(int key) {
            if (map == null) {
                return;
            }

            int index = key % size;
            Node bucket = map[index];

            if (bucket == null) {
                return;
            }

            if (bucket.key == key) {
                map[index] = bucket.next;
            }

            Node prev = bucket;
            bucket = bucket.next;
            while (bucket != null) {
                if (bucket.key == key) {
                    prev.next = bucket.next;
                }
                prev = bucket;
                bucket = bucket.next;
            }
        }

        private class Node {
            int key;
            int val;
            Node next;

            public Node(int key, int val) {
                this.key = key;
                this.val = val;
            }
        }
    }
}
