package org.example.yandex.algo;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthSequence = scanner.nextInt();
        int lengthQuery = scanner.nextInt();

        int[] sequence = new int[lengthSequence];
        for (int i = 0; i < lengthSequence; i++) {
            sequence[i] = scanner.nextInt();
        }

        int a;
        int b;
        for (int i = 0; i < lengthQuery; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            boolean flag = true;

            for (int j = a; j < b; j++) {
                if (sequence[j] < sequence[j + 1]) {
                    System.out.println(sequence[j + 1]);
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println("NOT FOUND");
            }
        }
    }
}
