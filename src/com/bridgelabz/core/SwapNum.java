package com.bridgelabz.core;

import java.util.Scanner;

public class SwapNum {
    public static void main(String[] args) {
        int x, y, z;
        Scanner n = new Scanner(System.in);
        System.out.println("Enter First Number ");
        x = n.nextInt();
        System.out.println("Enter Second Number ");
        y = n.nextInt();

        System.out.println("Before Swapping Number is " + x + " and " + y);
        z = x;
        x = y;
        y = z;

        System.out.println("After Swapping Number is " + x + " and " + y);
    }
}
