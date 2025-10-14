import java.util.Scanner;


public class PNZCheck {
 public static void main(String[] args){
  Scanner scn = new Scanner(System.in); //yk the drill

 System.out.println("Please give me a positive or a negative number");
   int numb = scn.nextInt(); // takes the number

  if (numb < 0) {
  System.out.println("The number is negative");
} else if (numb > 0) {
  System.out.println("The number is positive");
} else {
  System.out.println("The number is 0");
}

// :)
 }
}
