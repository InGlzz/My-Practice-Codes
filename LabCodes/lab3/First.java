package LabCodes.lab3;

import java.util.Scanner;


public class First{
 public static void main(String[] args) {
  Scanner scn = new Scanner(System.in);

 System.out.println("Please give an integer: ");
 int starValue = scn.nextInt();

 while(starValue < 0) {
   System.out.println("Please give a positive integer: ");
   starValue = scn.nextInt();
 }

//loops till the value given and has an inside loop that prints stars.
for (int i = 0; i < starValue; i++){
   for (int k = 0; k <= i; k++) {
       System.out.print("*");
   }
   System.out.println();
}




  }
}