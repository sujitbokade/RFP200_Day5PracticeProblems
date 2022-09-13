package com.bridgelabz.core;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        int Head = 0;
        int Tail = 0;
        int Count = 1;
        double Random = 0.0;

        System.out.println("Enter a Number ");
        Scanner n = new Scanner(System.in);
        int Flip = n.nextInt();

        while (Count <= Flip)
        {
            Random = Math.random();
            System.out.print(Count + " = " + Random);

            if (Random < 0.5) {
                Head = Head + 1;
                System.out.println(" ,Head ");
            } else {
                Tail = Tail + 1;
                System.out.println(" ,Tail ");
            }
            Count = Count + 1;
        }
        System.out.println("Number of Head- " + Head);
        System.out.println("Number of Tail- " + Tail);

        double headpercentage = (double) Head / Flip * 100;
        double tailpercentage = (double) Tail / Flip * 100;

        System.out.println("Percentage of head " + headpercentage);
        System.out.println("Percentage of tail " + tailpercentage);
    }
}

