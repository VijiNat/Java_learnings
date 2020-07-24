package com.la.conditionalsttmts;

public class WhosTheHero {

	String myHero = "Spiderman";

	public void SuperHeroGuessor() {
		if(myHero.equals("Iron Man")) {
			System.out.println("You thought about Iron Man");
		}else if(myHero.equals("Super Man")){
			System.out.println("You thought about Super Man");	
		}else if (myHero.equals("BAT Man")) {
			System.out.println("You thought about BAT Man");
		}else {
			System.out.println("unsure about your guess");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhosTheHero hero=new WhosTheHero();
		hero.SuperHeroGuessor();
	}

}
