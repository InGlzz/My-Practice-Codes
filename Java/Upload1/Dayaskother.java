package Java.Upload1;

import java.util.Scanner;

public class Dayaskother {
 public static void main(String[] args){
  Scanner scn = new Scanner(System.in); //Scanner as always

  System.out.println("Please give your day as an int from 1 to 7");
   int day = scn.nextInt(); //Takes the day

 switch (day) {
  case 1:
  case 2:
  case 3:
  case 4:
  case 5:
         System.out.println("You are in weekday");
  break;

  case 6:
  case 7:
         System.out.println("You are in weekend");
  break;
  default:
          System.out.println("No");
  }


 }
}
