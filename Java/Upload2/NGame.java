package Java.Upload2;

import java.util.Scanner;
import java.util.Random;

public class NGame {
	public static void main(String[] args){
	 Scanner scn = new Scanner (System.in);  //Scanner and random num generator.
     Random ranGen = new Random();

     String yesNo = ""; //Yes no string
     int chsNum = -1; //The number player chooses.

	 for (int j = -1 ; j < 0 ; ) {
		 j++;
		  int ranNumb = ranGen.nextInt(100) + 1; //random number that is generated.
     System.out.print("A random number has been chosen between 1-100. Try to find it. You got 7 tries.");

	 //loop and if else for the number possibilities.
	 for ( int i = 0 ; i < 7 ; i++ ) {
		 //Failsafe for non numbers.
         System.out.print("\nChoose a number: ");
		 if (scn.hasNextInt()){
		 chsNum = scn.nextInt();
		 } else {
			 System.out.println("Please enter a valid number.");
			 scn.next();
			 i--;
			 continue;
		 }

	     if (chsNum < ranNumb){
		 System.out.println("The number is bigger.");
	     } else if (chsNum > ranNumb) {
		 System.out.println("The number is smaller.");
	     } else {
		 System.out.println("You got the number :)");
		 break;
		 }
	 }

	 //Tells the number if fails
	 if (chsNum != ranNumb){
		 System.out.println("You are out of tries. Number was: " + ranNumb);
	  }
	  scn.nextLine();
	  System.out.println("Wanna try again Y/N: ");
      yesNo = scn.nextLine();

	  //Failsafe loop.
	  for(int k = 0 ; k < 1 ; ){
	     if (yesNo.equalsIgnoreCase("Y")){
		     j--;
			 break;
	   } else if (yesNo.equalsIgnoreCase("N")) {
		   break;
	   } else {
		  System.out.println("Please write Y or N ");
		   yesNo = scn.nextLine();
		   continue;
	  }
	 }


  }
	scn.close();

	}
}
