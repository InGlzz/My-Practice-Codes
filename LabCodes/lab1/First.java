package LabCodes.lab1;

import java.util.Scanner;

public class First{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	System.out.println("Please enter your name: ");	
		String naMe = sc.nextLine();
	System.out.println("Please enter your age: ");	
		int aGe = sc.nextInt();
	System.out.printf("Hello " + naMe + " %02d " , aGe);	
		aGe++;
	System.out.printf("Your age next year is: %02d " , aGe);	
	}
}