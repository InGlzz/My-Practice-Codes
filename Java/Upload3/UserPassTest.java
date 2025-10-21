package Java.Upload3;
import java.util.Scanner;

public class UserPassTest {
    //username check function
    public static boolean validateUsername (Scanner scn, String[] usernames) {
        int attemptCount = 0;
        boolean truthOfTheName = false;
        String userNameGiven = "-1";
             //Check for the username
            do  {
                //get the username
                System.out.println("Enter Your Username (Type exit to quit): ");
                userNameGiven = scn.nextLine(); //it gets the username from the user.
                //exit if its exit.
                if (userNameGiven.equalsIgnoreCase("exit")) {
                    System.exit(0);
                }

                for (String i : usernames) {
                 if (userNameGiven.equals(i)) {
                     truthOfTheName = true;
                     break;
                   }
                 } if (!truthOfTheName ) {
                    System.out.println("Invalid Username. Attempts left: " + (2 - attemptCount));
                }
                attemptCount++;
            } while ( attemptCount < 3 && !truthOfTheName );

            //max tries
            if ( truthOfTheName ) {
                return truthOfTheName;
            }
                System.out.println("Reached max amount of tries.");
        System.exit(0);
                return false;
    }



    public static void main (String [] args) {
        Scanner scn = new Scanner(System.in);
        String[] usernames = {"John","Doe","Micheal","admin","root"}; //users
        String[] passwords = {"CoolJohn","12@!yes","@!''yes","admin","root"}; //pass
        boolean storedUser = validateUsername(scn, usernames);

    }
}


