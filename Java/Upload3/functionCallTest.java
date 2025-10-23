package Java.Upload3;
import java.util.Random;

public class functionCallTest {
    public static void starPattern(int rows) {
        //top
    for (int i = 1; i < rows; i++) {
        //spaces
        for (int j = i; j < rows; j++) {
            System.out.print(" ");
        }
        //stars
        for (int k = 1; k <= (i * 2 - 1); k++) {
            System.out.print("*");
        }
        System.out.println();
    }
    //bottom
        for (int i = rows - 1 ; i >= 1; i--) {
    //spaces
        for (int j = rows; j > i ; j--) {
        System.out.print(" ");
        }
    //stars
    for (int k = 1; k <= (i * 2 - 1); k++) {
        System.out.print("*");
    }
    System.out.println();
        }
    }


    public static void main(String[] args) {
        Random randomnumb = new Random();
        int number1 = randomnumb.nextInt(5) + 3;


        System.out.println(number1);


        starPattern(number1);
    }

}
