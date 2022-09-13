package com.bridgelabz.core;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        int n;
        int count = 0;
        int power = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        n = sc.nextInt();

        while (power <= n) {

            System.out.println(power + " ");
            count++;
            power = (int) Math.pow(2, count);

        }
    }
}
