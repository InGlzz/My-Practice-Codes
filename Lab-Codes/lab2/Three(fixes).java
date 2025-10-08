import java.util.Random;
import java.util.Scanner;
public class Three {
	public static void main(String[] args){
		//Random number generator and selector
	Random rndm = new Random();	
		int rnNum1 = rndm.nextInt(999);
		int rnNum2 = rndm.nextInt(999);
		//Scanner for the inputs
	Scanner scn = new Scanner(System.in);	
		//ask for the input and explain
    System.out.println("First random number: " + rnNum1);
    System.out.println("\n Second random number: " + rnNum2);

    System.out.println("\n Please write a number between 1 and 4 for the following operations");  		
    System.out.println("\n 1, calculate and print the sum of the two generated numbers");
	System.out.println("\n 2, calculate and print the difference");
	System.out.println("\n 3, calculate and print the product");
	System.out.println("\n 4, calculate and print the division result of the first number divided by the second"); 
       //take the number
         int userNumb = scn.nextInt();
   //switch statements and a lil improvement.
		 switch (userNumb){
			 case 1:
			 int sumNum = (rnNum1 + rnNum2);
			 System.out.println("The number is: " + sumNum);
			 break;
			 case 2:
			 int difNum = ((rnNum1 - rnNum2));
			 if (difNum < 0) {
				int difNum2 = (rnNum2 - rnNum1);
				System.out.println("Your number is: " + difNum2);
			 } else {System.out.println("Your number is: " + difNum);
			 }
			 break;
			 case 3:
			 int prodNum = ((rnNum1 * rnNum2));
			 System.out.println("Your number is: " + prodNum);
			 break;
			 case 4:
			 if (rnNum2 == 0) {
			     System.out.println("Sorry one number was 0 please try again");
                           break;
			 }
			 float divNum = ((float)rnNum1 / (float)rnNum2);
             System.out.println("Your number is: " + divNum);		 
		     break;
           default:
		   System.out.println("Invalid, Please enter a number between 1 and 4.");
		 }
	}
}
