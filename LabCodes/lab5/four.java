package LabCodes.lab5;
import java.util.Random;

public class four {
    public static void main(String[] args) {
        Random random = new Random(System.currentTimeMillis());

        int sunny = 0, cloudy = 0, rainy = 0, stormy = 0;
        String[] weatherProb = new String[100];
        for (int i = 0; i < 40; i++) weatherProb[i] = "Sunny";
        for (int i = 40; i < 70; i++) weatherProb[i] = "Cloudy";
        for (int i = 70; i < 90; i++) weatherProb[i] = "Rainy";
        for (int i = 90; i < 100; i++) weatherProb[i] = "Stormy";

        for (int j = 0; j < 1000000; j++) {
         String day = weatherProb[random.nextInt(100)];
            if (day.equals("Sunny")) sunny++;
            else if (day.equals("Cloudy")) cloudy++;
            else if (day.equals("Rainy")) rainy++;
            else if (day.equals("Stormy")) stormy++;
        }
        System.out.println("Sunny: %" + (float)sunny / 10000);
        System.out.println("Cloudy: %" + (float)cloudy / 10000);
        System.out.println("Rainy: %" + (float)rainy / 10000);
        System.out.println("Stormy: %" + (float)stormy / 10000);


    }
}
