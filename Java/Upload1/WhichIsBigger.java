package Java.Upload1;

import java.util.Scanner;

public class WhichIsBigger{
 public static void main(String[] args) {

 Scanner scn = new Scanner(System.in); //Scanner
 System.out.println("Please write two numbers:");
   float a = scn.nextFloat(); //First Number
   float b = scn.nextFloat(); //Second number

  if (a > b) {
   System.out.println(a + " is bigger than " + b); //Checking conditions.
}
  else if (b > a) {
   System.out.println(b + " is bigger than " + a);
}
   else {
   System.out.println(a + " is equal to " + b);
}

 }
}
