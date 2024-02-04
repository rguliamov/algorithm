package org.example.leetcode.tree_tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task559 {

    List<Integer> lengths = new ArrayList<>();

    public static void main(String[] args) {
        Node treeNode = new Node(1);

        ArrayList<Node> childes1 = new ArrayList<>();
        Node node2 = new Node(2);
        node2.children = Collections.emptyList();
        Node node3 = new Node(3);
        node3.children = Collections.emptyList();
        childes1.add(node2);
        childes1.add(node3);
        treeNode.children = childes1;

        System.out.println(new Task559().maxDepth(null));
    }

    public int maxDepth(Node root) {
        return dfs(root);
    }

    public int dfs(Node root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        for (int i = 0; i < root.children.size(); i++) {
            max = Integer.max(max, dfs(root.children.get(i)));
        }
        return max + 1;
    }
}
