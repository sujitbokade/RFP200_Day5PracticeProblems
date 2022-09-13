package com.bridgelabz.functional;

import java.util.Scanner;

public class SumOfThreeInt {
    static void Sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n = sc.nextInt();
        int[] A = new int[n];
        int found = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if ((A[i] + A[j] + A[k]) == 0) {
                        System.out.println(A[i] + " " + A[j] + " " + A[k]);
                        found = 1;
                        count++;
                    }
                }
            }
        }
        System.out.println("Number of distinct triplets are: " + count);
        if (found == 0) {
            System.out.println("not found");
        }
    }

    public static void main(String[] args) {
        Sum();
    }
}
