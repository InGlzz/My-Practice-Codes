package LabCodes.lab4;
import java.util.Scanner;

public class one {
    public static long factorial(long n) {
        if (n < 0) System.exit(0);
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Enter the number that is going to be taken factorial of: ");
        Scanner scn = new Scanner(System.in);
        long givenNumb = scn.nextLong();
        long writtenNumber = factorial(givenNumb);
        System.out.println(writtenNumber);
    }
}