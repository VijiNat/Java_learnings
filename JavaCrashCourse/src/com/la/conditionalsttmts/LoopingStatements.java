package com.la.conditionalsttmts;

public class LoopingStatements {

	public static void main(String[] args) {
		
		/*
		 * for(int times=0; times<25;times++) { System.out.
		 * println("I am capable of learning automation. I can do all things through Him who strengthens me."
		 * ); }
		 */
		int times=0;
		/*
		 * while(times<25) { System.out.
		 * println("I am capable of learning automation. I can do all things through Him who strengthens me."
		 * +times); times++; }
		 */
		do {
			System.out.println("I am capable of learning automation. I can do all things through Him who strengthens me."+times); 
			times++;
		} while (times<25);
	}

}
