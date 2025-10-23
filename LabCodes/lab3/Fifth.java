package LabCodes.lab3;

import java.util.Scanner;

public class Fifth {
    public static void fizzBuzz(int n){
        for (int i = 1; i <= n; i++) {

             if (i % 3 == 0 && i % 5 == 0) {
                 System.out.print("FizzBuzz ");

             }  if (i % 3 == 0 && i % 5 != 0) {
                 System.out.print("Fizz ");

             } if (i % 3 != 0 && i % 5 == 0) {
                 System.out.print("Buzz ");

             } if (i % 3 != 0 && i % 5 != 0) {
                 System.out.print(i + " ");
             }

         }
        }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
    System.out.print("Give the last number: ");
    int numberGiven = scn.nextInt();
    fizzBuzz(numberGiven);

    }
}