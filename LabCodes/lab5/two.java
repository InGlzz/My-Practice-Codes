package LabCodes.lab5;
import java.util.Scanner;

public class two {
    public static void oldToNew(long[] oldArray, int newSize) {
        long[] chosenArray = new long[newSize]; //the students number.

        for (int i = 0; i < oldArray.length; i++) {
            chosenArray[i] = oldArray[i];
        }

        for (int i = 0; i < oldArray.length; i++) {
            System.out.print(oldArray[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < chosenArray.length; i++) {
            System.out.print(chosenArray[i] + " ");
        }
    }

    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
        long[] oldArray = new long[20];

        System.out.println("please enter the desired class value: ");
        int newArrayValue = scn.nextInt();

        for (int i = 0; i < oldArray.length; i++) {
            oldArray[i] = 1000 + i;
        }

        oldToNew(oldArray, newArrayValue );
    }
}