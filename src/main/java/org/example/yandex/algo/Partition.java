package org.example.yandex.algo;

import java.util.Scanner;
import java.util.function.Predicate;

public class Partition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Partition partition = new Partition();

        int N = scanner.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        int baseElement = scanner.nextInt();

        int result = partition.partition(e -> e < baseElement, array);
        System.out.println(result);
        System.out.println(N - result);
    }

    public int partition(Predicate<Integer> predicate, int[] array) {
        int count = 0;

        for (int element: array) {
            if (predicate.test(element)) {
                count++;
            }
        }

        return count;
    }
}
