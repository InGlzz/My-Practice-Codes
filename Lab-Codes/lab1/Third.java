import java.util.Scanner;

public class Third{
     public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the cent(kurus) amount: ");
	float kurş = sc.nextInt();
         	
	float tl = kurş / 100;
	float Seperated = tl / 3;
    float kuruş = tl%100;
	
	
	System.out.printf("Seperated money(int): " + (int)Seperated);
	System.out.printf(" Seperated money(float): " + Seperated);
	System.out.printf(" Kurus remaining: " + kuruş);
  }
}