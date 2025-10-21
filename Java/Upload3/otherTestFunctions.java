package Java.Upload3;

import java.util.Scanner;

public class otherTestFunctions {

    public static int valueTest (int a, int b){
     return  a + b;
    }

    public static void main (String [] args){
        Scanner scn = new Scanner(System.in);
        int yes = scn.nextInt();
        int no = scn.nextInt();
        int valGotten = valueTest(yes, no);
        System.out.println(valGotten);
        System.out.println(yes + no);
    }
}
