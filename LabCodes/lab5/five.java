package LabCodes.lab5;
import java.util.Random;

public class five {
    public static void main(String[] args) {
        Random random = new Random(System.currentTimeMillis());
        int tallest = 0;
        int howMany = 0;
        int peakArrayPrint = 0;

        int[] peaks = new int[30];
        int[] arrayThirty = new int[30];

        for (int i = 0; i < arrayThirty.length; i++) arrayThirty[i] = random.nextInt(100)+1;

        for (int i = 1; i < arrayThirty.length - 1; i++) {
             if (arrayThirty[i] > arrayThirty[i - 1] && arrayThirty[i] > arrayThirty[i + 1]) {
                howMany++;
                peaks[peakArrayPrint] = arrayThirty[i];
                peakArrayPrint++;
                if (arrayThirty[i] > tallest)  tallest = arrayThirty[i];
            }
        }

        System.out.print("peak: ");
        for (int i = 0; i  < howMany; i++ ) System.out.print(peaks[i] + ", ");
        System.out.println("How many times peaked: " + howMany);
        System.out.println("Peak array point: " + tallest);
    }
}
