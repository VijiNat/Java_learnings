package com.la.conditionalsttmts;

public class LetshaveCoffee {
	
	boolean isCupEmpty=true;
	
	public static void main(String[] args) {
		
		LetshaveCoffee coffee = new LetshaveCoffee();
		if(coffee.isCupEmpty) {
			System.out.println("Fill the cup");
		}else {
			System.out.println("Drink Coffee");
		}

	}

}
