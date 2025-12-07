package Java.Upload4.Bank;

import java.util.Scanner;

public class Main {

	public static int printOperations(Scanner scn) {
		int operationNumber;
		System.out.println("""
					○ 1 → Deposit
					○ 2 → Withdraw
					○ 3 → Account Details
					○ 4 → Exit""");
		operationNumber = Integer.parseInt(scn.nextLine());
		return operationNumber;
	} //Prints the operations

	public static void main(String[] args) {
		String bankName;
		boolean loop = true;
		String yesNo;
		//Scanner
		Scanner scn = new Scanner(System.in);
		//Set the bank account
		BankAccount bnk1 = new BankAccount("JohnDoe", 1000);
		System.out.println("Welcome: " + bnk1.getAccountID());

		System.out.println("Do you want to change your username? y/n");
		bankName = scn.nextLine();
		if (bankName.equalsIgnoreCase("y")){
			//Change username
			System.out.println("Set a bank account username: ");
			bankName = scn.nextLine();
			bnk1.setAccountID(bankName);
		}

		//Banking operations
		while (loop) {
			int moneyAmount;
			//operations
			switch (printOperations(scn)) {
				case 1:
					System.out.println("How much do you want to deposit?");
					moneyAmount = Integer.parseInt(scn.nextLine());
					if (moneyAmount > 0) {
						bnk1.deposit(moneyAmount);
					} else {
						System.out.println("Please enter a viable amount.");
					}
					break;
				case 2:
					System.out.println("How much money do you want to withdraw? Account balance: " + bnk1.getBalance());
					moneyAmount = Integer.parseInt(scn.nextLine());
					if (moneyAmount <= bnk1.getBalance()) {
						bnk1.withdraw(moneyAmount);
					} else {
						System.out.println("Do you want to borrow some money? y/n");
						yesNo = scn.nextLine();
						if (yesNo.equalsIgnoreCase("y")){
							bnk1.withdraw(moneyAmount);
						} else {
							break;
						}
					}
					break;
				case 3:
					System.out.println("AccountID: " + bnk1.getAccountID());
					System.out.println("Balance: " + bnk1.getBalance());
					break;
				default:
					loop = false;
					break;
			}
			System.out.println();
		}
	}
}