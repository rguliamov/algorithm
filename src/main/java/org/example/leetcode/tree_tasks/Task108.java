package org.example.leetcode.tree_tasks;

public class Task108 {
    public static void main(String[] args) {
        TreeNode treeNode = new Task108().sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});

        System.out.println(treeNode.right.val);
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    public TreeNode sortedArrayToBST(int[] nums, int l, int r) {
        if (l > r) {
            return null;
        }

        int mid = (l + r) / 2;
        TreeNode node = new TreeNode(nums[mid]);

        node.left = sortedArrayToBST(nums, l, mid - 1);
        node.right = sortedArrayToBST(nums, mid + 1, r);

        return node;
    }
}
