package com.company.labsheet;

import java.util.Scanner;

/**
 * 1. Write a program to calculate and print compound interest amount (f) when p,n,r are given
 * (Formula : f = p x (l +r)n, r should be given in decimal like. (r = 0.15)
 */
public class Question1 {
    private static final Scanner input = new Scanner((System.in));

    public static void main(String[] args) {
        System.out.println("Enter the amount: ");
        int p = input.nextInt();
        System.out.println("Enter the time: ");
        int n = input.nextInt();
        System.out.println("Enter the rate: ");
        float r = input.nextFloat();

        float f = (float) (p * Math.pow((1 + r),n));
        System.out.println("Compound interest " + f);
    }
}
