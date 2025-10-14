import java.util.Scanner;


public class BasicCalc{
 public static void main(String[] args){
 Scanner scn = new Scanner(System.in); //scanner

 System.out.println("Please enter the first number:"); //First number
   double a = scn.nextDouble();
 System.out.println("Please enter the second number:"); //Second number
   double b = scn.nextDouble();
 System.out.println("Please enter the operation you want to do (+,-,*,/)"); //operation
   char operation = scn.next().charAt(0);
//The operations part
 if (operation == '+') {
    if ((a + b) == (int) (a + b)){ //Checks if it's an int value
  System.out.printf("Your number is: %02d%n", (int) (a + b)); //if its int it prints out as a 2 number. ex 01,21
}  else {
  System.out.printf("Your number is: %.4f%n",  (a +b)); //if its float it sums up to the nearest 4 number after the dot
 }
}

  else  if (operation == '-') {
         if ((a - b) == (int)(a - b)){
  System.out.printf("Your number is: %02d%n", (int) (a - b)); //same goes for here
}  else {
  System.out.printf("Your number is: %.4f%n", (a - b));
 }
}

 else if (operation == '*') {
       if ((a * b) == (int) (a * b)) {
  System.out.printf("Your number is: %02d%n", (int) (a * b));
}  else {
  System.out.printf("Your number is: %.4f%n", (a * b));
 }
}

 else if (operation == '/') {
       if (b != 0){
        if ((a / b) == (int)(a / b)) {
  System.out.printf("Your number is: %02d%n", (int)(a / b));
} else {
  System.out.printf("Your number is: %.4f%n", (a / b));
 }
}  else {  //the undefined 0
  System.out.println("You can't do that");
 }
}

 else {
  System.out.println("You have entered an unspecified operation."); //If user enters an unspecified operation.
}

 }
}
