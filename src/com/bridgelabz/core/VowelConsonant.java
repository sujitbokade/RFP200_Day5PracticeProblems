package com.bridgelabz.core;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter a alphabet ");
        char ch = r.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("It is Vowel");
        } else {
            System.out.println("It is Consonant");
        }
    }
}
