import java.util.Scanner;

public class Second{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	System.out.println("Please enter a float number: ");
		float flNum = sc.nextFloat();
	System.out.println("Float: " + flNum + " int: " + (int)flNum);	
    System.out.println("Enter an int number: ");
	    int inNum = sc.nextInt();
	System.out.println("int: " + inNum + " float: " + (float)inNum);
 } 
}
// the part after the dot is lost. Because it turns into an int number.