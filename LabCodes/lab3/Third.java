import java.util.Scanner;

public class Third{
    public static int factorial(int n){
        int valueAfterOperations = 1;
     if (n < 0){
         System.out.println("invalid value");
                 System.exit(0);
     }

     for (  ; n > 0; ){
         valueAfterOperations *= n;
         n--;
     }
     return valueAfterOperations;
    }


    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    System.out.print("Please give the number that we will take the factorial of: ");
    int number = scn.nextInt(); //user gives the number
    int answer = factorial(number);
    System.out.println("The answer is: " + answer);



    }



}