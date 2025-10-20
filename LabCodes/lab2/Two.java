package LabCodes.lab2;

import java.util.Scanner;


public class Two {
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in); //Scanner

   System.out.println("Can you please write your Studen ID?: ");//ask for student id
	long id = scn.nextLong();
        //New update: Boolean values
        boolean alpha = ((id % 2) == 0 && (id % 3) != 0);
        boolean beta = ((id % 5) == 0 || (id % 7) == 0);
        boolean theta = ((id % 9 > 5));
	//If else statements for team calibration.
	       if (alpha)  {
		System.out.println("You are in team ALPHA");
	} else if (beta) {
		System.out.println("You are in team BETA");
	} else if (theta) {
		System.out.println("You are in team THETA");		
	} else {
			System.out.println("You are in team SIGMA");
	} 
	//2 team possibilities.	
	if ((alpha && beta) || (alpha && theta) || (theta && beta)){
        System.out.println("You are eligible to enter more than 1 team. Choose one.");
        }
   }
} 
