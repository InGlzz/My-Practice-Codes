package Java.Upload2;

import java.util.Random;

public class star2 {
  public static void main(String[] args) {
int stars = -1;
int lines = -1;
Random rndmnumgen = new Random();

stars = rndmnumgen.nextInt(20) + 3;
lines = rndmnumgen.nextInt(20) + 3;

System.out.println("Stars: " + stars);
System.out.println("Lines: " + lines);

for (int i = 0 ; i < stars ; i++){
  if (i % 2 == 1) {
 System.out.print(" ");
  }
  for ( int j = 0; j < lines; j++) {
 System.out.print("* ");
}

System.out.println("");
}



  }
}
