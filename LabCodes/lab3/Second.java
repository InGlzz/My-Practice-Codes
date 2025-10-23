import java.util.Scanner;

public class Second {
    public static void main(String[] args){
        int firstInt = -1; //the first number user gives
        int secondInt = -1;//The second number
        int answer = -0;// answer (sum)

        Scanner scn = new Scanner(System.in);

            System.out.print("Please enter the first integer: ");
            firstInt = scn.nextInt();
            System.out.print("Please enter the second integer: ");
            secondInt = scn.nextInt();

            //fix
            if (firstInt > secondInt) {
                System.out.println("First integer cant be bigger than Second integer");
                System.exit(0);
            }


        //for loop that gets the sum
        for (int i = firstInt; i <= secondInt; i++){
            answer += i;
        }

        //print the answer
        System.out.println("The sum is: " + answer);

    }
}