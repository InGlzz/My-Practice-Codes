package LabCodes.lab4;

import java.util.Scanner;

public class three {
    public static long power(long base, int exp) {
        if (exp == 0) return 1;
        return base * power(base, exp - 1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Give 2 numbers: ");
        long baseNumber = scn.nextLong();
        int expNumber = scn.nextInt();
        long result = power(baseNumber, expNumber);
        System.out.println("Result is: " + result);
    }
}