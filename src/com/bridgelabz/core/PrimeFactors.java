package com.bridgelabz.core;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                n = n / i;
                System.out.println(i);
            }
        }
    }
}
