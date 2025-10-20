package Java.Upload2;

import java.util.Random;

public class star3 {
  public static void main(String[] args){
Random rndmgen = new Random();


int line = rndmgen.nextInt(20) + 3;
int star = 0;
System.out.println(line);

for (int i = 0 ; i < line ; i++){
star = 0;
  for (int k = 0; k<1; ) {
    if (star < i) {
     System.out.print("* ");
      star++;
   } else {
 break;
        }
  }
System.out.println("");
}

 }
}
