package org.example.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(generate(6));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(List.of(1));

        for (int i = 1; i < numRows; i++) {
            List<Integer> row1 = triangle.get(i - 1);
            List<Integer> row2 = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                int l = j - 1;

                if (l < 0) {
                    row2.add(row1.get(j));
                } else if (j >= row1.size()){
                    row2.add(row1.get(l));
                } else {
                    row2.add(row1.get(l) + row1.get(j));
                }
            }

            triangle.add(row2);
        }

        return triangle;
    }

    public static void printTriangle(List<List<Integer>> triangle) {

    }
}
