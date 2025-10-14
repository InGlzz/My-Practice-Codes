import java.util.Random;
public class star1 {
 public static void main(String[] args){

int stars = 0; //amnt of stars
int lines = 0; //amnt of lines
//random num gen
Random rndmnumgen = new Random();
stars = rndmnumgen.nextInt(20)+3;
lines = rndmnumgen.nextInt(20)+3;

System.out.println("Stars: " + stars);
System.out.println("lines: " + lines);

for (int i = 0 ; i < lines ; i++) {
    for (int j = 0; j < stars ; j++) {
     System.out.print("* ");
 }
System.out.println("");
}


 }
}
