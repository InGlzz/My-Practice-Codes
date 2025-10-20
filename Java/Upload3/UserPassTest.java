package Java.Upload3;
import java.util.Scanner;

public class UserPassTest {
    //username check function
    public static boolean validateUsername (Scanner scn, String[] usernames) {
        int attemptCount = 0;
        boolean truthOfTheName = false;
        String userName = "-1";
             //Check for the username
            do  {
                //get the username
                System.out.println("Enter Your Username (Type exit to quit): ");
                userName = scn.nextLine(); //it gets the username from the user.
                //exit if its exit.
                if (userName.equalsIgnoreCase("exit")) {
                    System.exit(0);
                }

                for (int i = 0; i < usernames.length; i++) {
                 if (userName.equals(usernames[i])) {
                     truthOfTheName = true;
                     break;
                   }
                 } if (!truthOfTheName ) {
                    System.out.println("Invalid Username. Attempts left: " + (3 - attemptCount));
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


