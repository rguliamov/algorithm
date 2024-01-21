package org.example.leetcode.tree_tasks;

public class Task104 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);

        treeNode.left = new TreeNode(2);
        treeNode.left.left = new TreeNode(3);
        treeNode.left.right = new TreeNode(4);

        treeNode.right = new TreeNode(2);
        treeNode.right.right = new TreeNode(3);
        treeNode.right.left = new TreeNode(4);

        System.out.println(new Task104().maxDepth(treeNode));
    }

    public int maxDepth(TreeNode root) {
       if (root == null) {
           return 0;
       }

       return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
