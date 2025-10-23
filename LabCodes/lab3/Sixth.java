import java.util.Scanner;

public class Sixth {

    public static boolean primeNumberCheck (int a){
    //check if its 2 or smaller than 1
        if (a <= 1) return false;
        if (a == 2) return true;
    // divise with 2 if you can its not prime
    for (int i = 2; i <= a / 2; i++) {
        if (a % i == 0) {
            return false;
        }
    }
    //the prime numbers
return true;
    }



    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);

     int start = 0; //first number
     int end = 0; //second number

        System.out.println("Please enter a start number: ");
         start = scn.nextInt();
        System.out.println("Please enter a end number: ");
         end = scn.nextInt();

        for (int i = 1; i <= 1000 ; i++) {
          //Steps asked
            if (i == 1000) {
                System.out.println("infinite loop detected!");
				System.exit(0);
            }

            if (start == end) {
                System.out.println("Start: " + start + " End: " + end);
                break;
            }

            if (start % 2 == 0){
                System.out.println("Step: " + i + " → " + start + " (even → n / 2)");
               start = start / 2;
           continue;
           } else if (start % 3 == 0) {
               System.out.println("Step: " + i + " → " + start + " (divisible by 3 → n + 4)");
               start = start + 4;
           continue;
           } else if (primeNumberCheck(start)){
               System.out.println("Step: " + i + " → " + start + " (prime → n * 2)");
               start = start * 2;
               continue;
           } else {
                System.out.println("Step " + i + " → " + start + " (none → n + 1)");
                start = start + 1;
                continue;
            }

        }




    }
}
