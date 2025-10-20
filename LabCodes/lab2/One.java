package LabCodes.lab2;

import java.util.Random;

public class One {
	public static void main(String[] args) {
     Random rndGen = new Random(); //Generate random number
	 
	 int clock1 = rndGen.nextInt(24);
	 int clock2 = rndGen.nextInt(60);
	//Show time on the screen
	System.out.println("Time is: " + clock1 + ":" + clock2);
	//if else for which one is bigger
	  if (clock1 > clock2) {
		  System.out.println(clock1 + " is bigger than " + clock2);		  
	  } else if (clock2 > clock1) {
		  System.out.println(clock2 + " is bigger than " + clock1);
	  } else {
		  System.out.println(clock1 + " is equal to " + clock2);
	  }
  }
}