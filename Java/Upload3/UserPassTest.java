package Java.Upload3;
import java.util.Scanner;
import java.util.ArrayList;

public class UserPassTest {

    public static int validateUsername (Scanner scn, ArrayList<String> usernames) {
        int attemptCount = 0;
        boolean truthOfTheName = false;
        String userNameGiven = "-1";
        int userIndex = -1;

             //Check for the username
            do  {
                truthOfTheName = false; //for glitches
                //get the username
                System.out.println("Enter Your Username (Type exit to quit): ");
                userNameGiven = scn.nextLine(); //it gets the username from the user.
                //exit if its exit.
                if (userNameGiven.equalsIgnoreCase("exit")) {
                    System.out.println("Goodbye!");
                    System.exit(0);
                }

                for (int i = 0; i < usernames.size(); i++) {
                 if (usernames.get(i).equals(userNameGiven)) {
                     truthOfTheName = true;
                     userIndex = i;
                     break;
                   }

                 } if (!truthOfTheName ) {
                    System.out.println("Invalid Username. Attempts left: " + (2 - attemptCount));
                }
                attemptCount++;
            } while ( attemptCount < 3 && !truthOfTheName );

            //max tries
            if ( truthOfTheName ) {
                return userIndex;
            }
                System.out.println("Reached max amount of tries.");
        System.exit(0);
                return -1;
    }


    public static boolean validatePassword(Scanner scn, ArrayList<String> passwords, int userIndex) {
        int attemptCount = 0;
        String givenPass;

        do {
            System.out.println("Enter Your Password: ");
            givenPass = scn.nextLine();

            if (passwords.get(userIndex).equals(givenPass)) {
                return true; // correct password for that specific user
            }

            attemptCount++;
            System.out.println("Invalid Password. Attempts left: " + (3 - attemptCount));

        } while (attemptCount < 3);

        System.out.println("Reached max amount of tries.");
        System.exit(0);
        return false;
    }


    public static void registerUser(Scanner scn, ArrayList<String> usernames, ArrayList<String> passwords) {
        String newUser;
        String newPassword;
    while(true) {
        System.out.println("Register Your Username: ");
        newUser = scn.nextLine();
        if (usernames.contains(newUser)) {
            System.out.println("Username already exists. Try again.");
            continue;
        } break;
    }

        System.out.println("Register Your Password: ");
        newPassword = scn.nextLine();

        usernames.add(newUser);
        passwords.add(newPassword);
    }


    public static void main (String [] args) {
        Scanner scn = new Scanner(System.in);

        //arraylist for new registers.
        ArrayList<String> usernames = new ArrayList<>();
        ArrayList<String> passwords = new ArrayList<>();

        //admin users,alr registered.
        usernames.add("John"); passwords.add("CoolJohn");
        usernames.add("Doe"); passwords.add("12@!yes");
        usernames.add("admin"); passwords.add("admin");
        usernames.add("msfadmin"); passwords.add("msfadmin");

        System.out.println("Do you want to register as a new user? Y/N");
        String yesNoForRegistry = scn.nextLine();
        if (yesNoForRegistry.equalsIgnoreCase("Y")) {
        registerUser(scn, usernames, passwords);
        }


        int storedUser = validateUsername(scn, usernames);
        boolean storedPass = validatePassword(scn, passwords, storedUser);

        if (storedPass) {
            System.out.println("You are now logged in as: " + usernames.get(storedUser));
        } else {
            System.out.println("Wrong Username or password!");
        }


        scn.close();
    }
}


