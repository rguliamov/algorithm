package org.example.algo;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] test = {1000, 80, 10, 50, 70, 60, 90, 20, 30, 40};
        quickSort.partition(test, 1, test.length - 2);
        System.out.println(Arrays.toString(test));
    }

    private int partition(int[] data, int low, int high) {
        int pivot = data[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (data[j] < pivot) {
                i++;
                swap(data, i, j);
            }
        }
        swap(data, i + 1, high);
        return i + 1;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}