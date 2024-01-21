package org.example.leetcode.tree_tasks;

public class Task101 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);

        treeNode.left = new TreeNode(2);
        treeNode.left.left = new TreeNode(3);
        treeNode.left.right = new TreeNode(4);

        treeNode.right = new TreeNode(2);
        treeNode.right.right = new TreeNode(3);
        treeNode.right.left = new TreeNode(4);

        System.out.println(new Task101().isSymmetric(treeNode));
    }

    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p != null && q != null) {
            return isSymmetric(p.left, q.right) && isSymmetric(p.right, q.left)  && p.val == q.val;
        }

        return false;
    }
}
