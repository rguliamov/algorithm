package org.example.algo.search;

import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> array = List.of(1, 2, 3);

        System.out.println(new BinarySearch().binarySearch(array, 3));
    }

    public int binarySearch(List<Integer> array, int target) {
        int l = 0;
        int r = array.size() - 1;
        int mid;

        while (l <= r) {
            mid = (l + r) / 2;
            if (target < array.get(mid)) {
                r = mid - 1;
            } else if (target > array.get(mid)) {
                l = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
