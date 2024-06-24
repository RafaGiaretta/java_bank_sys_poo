package entities;

public class BankAccount {
	private int number;
	private String name;
	private double balance;
	
	public BankAccount() {

	}
	public BankAccount(int number, String name) {
		this.number = number;
		this.name = name;
	}
	public BankAccount(int number, String name, double balance) {
		this.number = number;
		this.name = name;
		this.balance = balance;
	}
	
	
	public  int getNumber() {
		return this.number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance += balance;
	}
	
	public String toString() {
		return "Account data: \nAccount " 
				+ getNumber() + 
				", Holder: " + 
				getName() + 
				", Balance: $ " + 
				getBalance(); 
	}

	
	
	
	
}