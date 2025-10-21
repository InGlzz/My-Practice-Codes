package Java.Upload3;
import java.util.Scanner;

public class testFunctions {

    public static int equations(Scanner scn ) {
        System.out.println("Give an operator for equation.");
        String equationOperator = scn.nextLine();
        System.out.println("Enter the first number");
        int a = scn.nextInt(); //first number
        System.out.println("Enter the second number");
        int b = scn.nextInt(); //second number

        switch (equationOperator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
            if (b == 0) {
                System.out.println("Error: Division by zero is not allowed.");
                return -2147483648;
            }
                return a / b;
            default:
                System.out.println("Invalid equation operator");
                return -2147483648;
        }
    }



    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int returnValue = equations(scn);
        if (returnValue == -2147483648) {
            System.exit(0);
        }
        System.out.println(returnValue);
    }
}
