import java.util.Scanner;

public class NumberGuesser {
  public static void main(String[] args){
long low = 1; //smol number
int numberPut = -4;//Player number thats 1 0 -1
long threshold = -1; // number threshold
long cookin = -1; //the plus/2
int count = 0; //the bot tries

System.out.println("This is a robot that will try to guess the number you got in your head");
System.out.println("You just need to give an upper threshold. Dont go crazy if you dont want to be stuck for hours.");
System.out.println("I want you to write 0 if the number is right, 1 if the number is greater than current answer, -1 if its less.");
System.out.println("So whats the threshold?");
//Scanner and taking the number
Scanner scn = new Scanner(System.in);
while(true){
threshold = scn.nextLong();
if (threshold < 1){
System.out.println("Threshold must be bigger than 1!");
continue;
} else {
break;
 }
}

System.out.println("Now lets start. Put 1,0,-1. Lets find your number.");

//here we go.
do {
count++;
cookin = low + (threshold - low) / 2;
System.out.println(cookin);
//failsafe for other numbers
while (true) {
System.out.println("Put the numb: ");
numberPut = scn.nextInt();
if (numberPut > 1 || numberPut < -1) {
 System.out.println("Please put a valid number.");
 System.out.println("");
  } else {
 break;
 }
}
//easter egg
if (threshold < low){
  System.out.println("What have you done broski you broke me *sad machine noises*");
System.exit(0);
}
//if its small +1 if its big -1
if (numberPut == 1) {
  low = cookin + 1;
continue;
} else if (numberPut == -1) {
  threshold = cookin -1;
continue;
}
} while (numberPut != 0);


if (numberPut == 0) {
System.out.println("My guess is: "+ cookin + " :)" );
System.out.println("It took only "+ count + " tries");
}

scn.close();
 }
}
