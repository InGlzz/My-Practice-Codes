import java.util.Scanner;


public class Four {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); //Scanner
		//ask for ints
     System.out.println("Please enter 3 numbers between 1-500 for a triangles side:");
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		int num3 = scn.nextInt();
		if (num1 <= 0 || num2 <= 0 || num3 <= 0 ){
			System.out.println("INVALID LENGTH.");
		} else if ((num1 + num2) < num3 || (num1 + num3) < num2 || (num3 + num2) < num1) {
			System.out.println("NOT A TRIANGLE");
		} else if (num1 == num2 && num2 == num3 && num3 == num1) {
			System.out.println("EQUILATERAL");
		} else if (num1 == num2 || num2 == num3 || num3 == num1) {
			System.out.println("ISOSCELES");
		} else if (num1 != num2 && num2 != num3 && num3 != num1) {
			System.out.println("SCALENE");
		} if ((num1 + num2) > num3 && (num1 + num2) > num2 && (num3 + num2) > num1) {
			int perimeter = (num1 + num2 + num3);
			System.out.println("Perimeter: " + perimeter);
		}

	}
}
