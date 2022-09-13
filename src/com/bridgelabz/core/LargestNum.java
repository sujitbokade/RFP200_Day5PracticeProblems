package com.bridgelabz.core;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter First Number ");
        int x = n.nextInt();
        System.out.println("Enter Second Number ");
        int y = n.nextInt();
        System.out.println("Enter Third Number ");
        int z = n.nextInt();

        if (x > y && x > z) {
            System.out.println("Largest Number is " + x);
        } else if (y > x && y > z) {
            System.out.println("Largest Number is " + y);
        } else {
            System.out.println("Largest Number is " + z);
        }
    }
}
