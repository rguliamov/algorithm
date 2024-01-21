package org.example.leetcode.tree_tasks;

public class Task100 {

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(10);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(8);


        TreeNode root2 = new TreeNode(10);
        root2.left = new TreeNode(8);
        root2.right = new TreeNode(9);


        System.out.println(new Task100().isSameTree(root1, root2));
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p != null && q != null) {
            return (p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
        }

        return false;
    }
}
