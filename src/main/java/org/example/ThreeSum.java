package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ThreeSum {
    public static void main(String[] args) {
        int[] test = {-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6};

        ThreeSum threeSum = new ThreeSum();
        System.out.println(threeSum.threeSum(test));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        boolean breakOuterCycleFlag = false;

        Arrays.sort(nums);

        for (int num : nums) {
            if (num < 0) {
                negative.add(num);
            } else {
                positive.add(num);
            }
        }

        Collections.reverse(negative);

        if ((positive.size() > 2) && (positive.get(0) + positive.get(1) + positive.get(2) == 0)) {
            result.add(List.of(0, 0, 0));
        }

        if (negative.size() == 0) {
            return result;
        }

        if (positive.size() == 0) {
            return result;
        }

        int a, b, c;
        for (int i1 = 0; i1 < negative.size() - 1; i1++) {

            if ((negative.size() >= 2) && (negative.get(0) + negative.get(1) + positive.get(positive.size() - 1) < 0)) {
                break;
            }

            for (int i2 = i1 + 1; i2 < negative.size(); i2++) {
                a = negative.get(i1);
                b = negative.get(i2);
                if (a + b + positive.get(positive.size() - 1) < 0) {
                    break;
                }

                for (int j = 0; j < positive.size(); j++) {
                    c = positive.get(j);
                    if (a + b + c < 0) {
                        continue;
                    } else if (a + b + c > 0) {
                        break;
                    } else {
                        insert(result, List.of(a, b, c));
                    }
                }
            }
        }

        breakOuterCycleFlag = false;

        for (int i1 = 0; i1 < positive.size() - 1; i1++) {
            if (breakOuterCycleFlag) {
                break;
            }

            if ((positive.size() >= 2) && (positive.get(0) + positive.get(1) + negative.get(negative.size() - 1) > 0)) {
                break;
            }

            for (int i2 = i1 + 1; i2 < positive.size(); i2++) {
                a = positive.get(i1);
                b = positive.get(i2);
                if (a + b + negative.get(negative.size() - 1) > 0) {
                    break;
                }

                for (int j = 0; j < negative.size(); j++) {
                    if ((a = positive.get(i1)) + (b = positive.get(i2)) + (c = negative.get(j)) == 0) {
                        insert(result, List.of(a, b, c));
                    }
                }
            }
        }

        return result;
    }

    private void insert(List<List<Integer>> result, List<Integer> triple) {
        for (List<Integer> element : result) {
            if (equals(element, triple)) {
                return;
            }
        }

        result.add(triple);
    }

    private boolean equals(List<Integer> triple1, List<Integer> triple2) {
        for (int i = 0; i < 3; i++) {
            if (!Objects.equals(triple1.get(i), triple2.get(i))) {
                return false;
            }
        }

        return true;
    }
}
