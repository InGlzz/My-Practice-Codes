package LabCodes.lab5;
import java.util.Random;

public class three {
    public static int[] rotate (int[] randomNumberStore) {
        int[] rotatedNumberStore = new int[randomNumberStore.length];
        rotatedNumberStore[0] = randomNumberStore[randomNumberStore.length - 1]; //switch last and first number

        for (int i = 1; i < randomNumberStore.length; i++) {
            rotatedNumberStore[i] = randomNumberStore[i - 1];
        }

        return rotatedNumberStore;
    }



    public static void main(String[] args) {
        int[] randomNumberStore = new int[15];
        Random random = new  Random(System.currentTimeMillis());

        for (int i = 0; i < randomNumberStore.length; i++) {
            randomNumberStore[i] = random.nextInt(100); //puts random number in the array
        }
        int[] rotatedNumberStore = rotate(randomNumberStore); //rotate the number

        //print the rotated and the original number
        System.out.print("The original number: ");
        for (int i = 0; i < randomNumberStore.length; i++) {
            System.out.print(randomNumberStore[i] + " ");
        }
        System.out.println();
        System.out.print("The rotated number: ");
        for (int i = 0; i < randomNumberStore.length; i++) {
            System.out.print(rotatedNumberStore[i] + " ");
        }


        }
}
