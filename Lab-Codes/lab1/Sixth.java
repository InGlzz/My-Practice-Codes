import java.util.Scanner;

public class Third{
     public static void main(String[] args){
      Scanner sc = new Scanner(System.in);	
	  System.out.println("Please write a temperature value in celcius: ");
	  int celciusVal = sc.nextInt();
	  
	  int fahrenheitVal = celciusVal * 9/5 + 32;
	    System.out.println("Fahrenheit value is: " + fahrenheitVal);

   }
}