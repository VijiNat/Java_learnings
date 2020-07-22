package com.la.javaLearning;

public class NoArgumentConstructor {
	
	int Employeeid;
	String Employeename;
	
	NoArgumentConstructor(){
		Employeeid = 1234;
		Employeename = "Rock";
		System.out.println("Employee object has been created");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoArgumentConstructor noargconst = new NoArgumentConstructor();
		System.out.println(noargconst.Employeename);
	}

}
