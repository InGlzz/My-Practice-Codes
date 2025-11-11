package LabCodes.lab4;

import java.util.Scanner;
public class two {
    public static int sumDigits(int n) {
        if (n < 10) return n;
        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int givenNumber = scn.nextInt();
        int returnedNumber = sumDigits(givenNumber);
        System.out.println("Number is: " + returnedNumber);
    }
}