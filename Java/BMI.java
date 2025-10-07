import java.util.Scanner;


public class BMI {
  public static void main(String[] args){
Scanner sc = new Scanner(System.in);  //Key input detection
 System.out.println("What is your Height(M) and Weight(Kg)?");    //BMI Questions
  //BMI Calculation
double height = sc.nextDouble(); 
double Weight = sc.nextDouble();
double realHeight = height / 100;
double bmiValue = Weight / (realHeight * realHeight);


System.out.printf("Your BMI Calculated is: %.2f\n", bmiValue);   //Screen display of BMI
  }
}
