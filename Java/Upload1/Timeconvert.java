package Java.Upload1;

import java.util.Scanner;


public class Timeconvert {
    public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
      
  System.out.println("Write the seconds you wanna turn into hours/mins: ");
       int secondsInput = sc.nextInt();
       //Hours and Minutes and Seconds
       int hours = secondsInput / 3600;
       int minutes = secondsInput % 3600 / 60;
       int seconds = secondsInput % 60;
       //The screen print of h/m
  System.out.println("Hours: " + hours + "\nMinutes: " + minutes + "\nSeconds: " + seconds);  

    }
}