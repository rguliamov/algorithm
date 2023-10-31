package org.example;

public class RemoveElement {

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        int i = removeElement.removeElement(new int[]{1, 2, 3, 1, 1, 2, 3}, 1);
        System.out.println(i);
    }

    public int removeElement(int[] nums, int val) {
        int[] result = new int[nums.length];
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                result[k] = nums[i];
                k++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = result[i];
        }
        return k;
    }
}
