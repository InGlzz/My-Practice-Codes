package LabCodes.lab1;

import java.util.Scanner;

public class Fifth {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
     System.out.println("Whats the first quiz note?");
	  float firstQuiz = sc.nextFloat();
     System.out.println("Whats the second quiz note?");
          float secondQuiz = sc.nextFloat();
     System.out.println("Whats the Third quiz note?");
	  float thirdQuiz = sc.nextFloat();

    float allQuizes = firstQuiz + secondQuiz + thirdQuiz;
	  float quizCount = allQuizes * 40 / 100;

     System.out.println("Whats your Final exam note?");
     float finalQuiz = sc.nextFloat();
	 float countedFinalQuiz = finalQuiz * 60 / 100;

	 float theNote = countedFinalQuiz + quizCount;
	     System.out.println("Your note is: " + theNote);
   }
}
