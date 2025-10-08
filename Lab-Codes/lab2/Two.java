import java.util.Scanner;


public class Two {
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in); //Scanner

   System.out.println("Can you please write your Studen ID?: ");//ask for student id
	long id = scn.nextLong();
	//If else statements for team calibration.
	
	if ((id % 2) == 0 && (id % 3) != 0)  {
		System.out.println("You are in team ALPHA");
	} else if ((id % 5) == 0 || (id % 7) == 0) {
		System.out.println("You are in team BETA");
	} else if ((id / 9) > 5) {
		System.out.println("You are in team THETA");		
	} else {
			System.out.println("You are in team SIGMA");
	} 
	//2 team possibilities.	
	if ((id % 2) == 0 && (id % 3) != 0 && (id / 9) > 5 || (id % 5) == 0 || (id % 7) == 0 && (id % 2) == 0 && (id % 3) != 0 || (id % 5) == 0 || (id % 7) == 0 && (id / 9) > 5){
        System.out.println("You are eligable to enter more than 1 team. Choose one.");
	} 
	//trash
	 //if ((id % 5) == 0 || (id % 7) == 0 && (id % 2) == 0 && (id % 3) != 0) {
		//System.out.println("You are eligable to enter more than 1 team. Choose one.");
     // if ((id % 5) == 0 || (id % 7) == 0 && (id / 9) > 5) {
		//System.out.println("You are eligable to enter more than 1 team. Choose one.");
     //	}

   }
} 