package org.example.leetcode.tree_tasks;

public class Task653 {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(0);
        root1.right = new TreeNode(3);

        root1.left.left = new TreeNode(-4);
        root1.left.right = new TreeNode(1);

        System.out.println(new Task653().findTarget(root1, -1));
    }

    public boolean findTarget(TreeNode root, int k) {
        return findTarget(root, root, k);
    }

    private boolean findTarget(TreeNode root, TreeNode node, int k) {
        if (node == null) {
            return false;
        }

        TreeNode findTreeNode = binarySearch(root, k - node.val);

        if (findTreeNode != null && findTreeNode != node) {
            return true;
        }

        return findTarget(root, node.left, k) || findTarget(root, node.right, k);
    }

    private TreeNode binarySearch(TreeNode root, int target) {
        if (root == null) {
            return null;
        }

        if (target < root.val) {
            return binarySearch(root.left, target);
        } else if (target > root.val) {
            return binarySearch(root.right, target);
        } else {
            return root;
        }
    }
}
