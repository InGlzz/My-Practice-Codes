import java.util.Scanner;

public class Dayask{
 public static void main(String[] args) {
       Scanner scn = new Scanner(System.in); //scanner as always
 System.out.println("Give the day as an integer(please): ");
    int day = scn.nextInt(); //day as an int
 //check if its weekend or weekday
  if (day <= 5 && day > 0) {
  System.out.println("Today is a weekday");
}
  else if (day == 6 || day == 7) {
  System.out.println("Today is weekend");
}
  else {
  System.out.println("Not today broski");
}

 }
}
