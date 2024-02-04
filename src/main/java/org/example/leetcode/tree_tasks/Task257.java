package org.example.leetcode.tree_tasks;

import org.example.leetcode.tree_tasks.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Task257 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);

        treeNode.left = new TreeNode(2);
        treeNode.left.left = new TreeNode(3);
        treeNode.left.right = new TreeNode(4);

        treeNode.right = new TreeNode(2);
        treeNode.right.right = new TreeNode(3);
        treeNode.right.left = new TreeNode(4);

        System.out.println(new Task257().binaryTreePaths(treeNode));
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> answer = new ArrayList<>();

        if (root != null) {
            search(root, new StringBuilder(), answer);
        }

        return answer;
    }
    private void search(TreeNode root, StringBuilder path, List<String> answer) {
        if (root.left == null && root.right == null) {
            answer.add(path.append(root.val).toString());
        }
        if (root.left != null) {
            search(root.left, new StringBuilder(path).append(root.val).append("->"), answer);
        }
        if (root.right != null) {
            search(root.right, new StringBuilder(path).append(root.val).append("->"), answer);
        }
    }
}
