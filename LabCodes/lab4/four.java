package LabCodes.lab4;

import java.util.Scanner;
public class four {
    public static int fibonacci(int a) {
        if (a == 0) return 0;
        if (a == 1) return 1;
        return fibonacci(a - 2) + fibonacci(a - 1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Give the number that is going to hava its fibonacci taken: ");
        int fibNumber = scn.nextInt();
        int fibResult = fibonacci(fibNumber);
        System.out.println("Result: " + fibResult);
    }
}