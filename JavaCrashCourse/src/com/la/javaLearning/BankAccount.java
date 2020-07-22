package com.la.javaLearning;

public class BankAccount {
	
	Long accountNumber = 1234567890l;
	String accountHolder = "Viji";
	Integer accountBalance = 2000;
	
	public void getBalance() {
		System.out.println("The balance is $"+ accountBalance);
	}
	

	public static void main(String[] args) {
		// ClassName objName = new ClassName();
		BankAccount account = new BankAccount();
		account.getBalance();

	}

}
