package LabCodes.lab3;

import java.util.Scanner;

public class Fourth {
    public static int reverse(int n){
       int revnum = 0; //reversed number used by method
       int remainder;
            while (n > 0){
                remainder = n % 10;
                revnum = (revnum * 10) + remainder;
                n = n / 10;
            }
            return revnum;

    }

    public static void main(String[] args){
     Scanner scn = new Scanner(System.in);
     System.out.print("Enter the number that is going to be reversed: ");
     int numberGiven = scn.nextInt(); //the number user gives
     int reversedNumber = reverse(numberGiven); //the number that is reversed by the method
        System.out.print("The reversed number is: " + reversedNumber);


    }
}