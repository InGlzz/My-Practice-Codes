package Java.Upload4.Bank;


public class BankAccount {
    private String accountID;
    private int balance;
    //Constructor
    public BankAccount(String accountID, int balance) {
		this.accountID = accountID;
		this.balance = balance;
    }
	//setter getter
	public void setAccountID(String accountID) {this.accountID = accountID;}
	public void setBalance(int balance) {this.balance = balance;}
	public String getAccountID() {return accountID;}
	public int getBalance() {return balance;}

	//bank account operations
	public void deposit(int givenMoney) {
		balance += givenMoney;
	}

	public void withdraw(int givenMoney) {
		balance -= givenMoney;
	}
}