package com.la.javaLearning;

public class Parameterizedconstructor {
	
	String animal_name;
	String animal_type;
	
	Parameterizedconstructor(String name, String type){
		animal_name = name;
		animal_type = type;
	}

	public void describeanimals() {
		System.out.println("Animal name is "+ animal_name+" and type is "+animal_type);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parameterizedconstructor animal1 = new Parameterizedconstructor("Tiger", "Carnivores");
		Parameterizedconstructor animal2 = new Parameterizedconstructor("Elephant", "Herbivores");
		animal1.describeanimals();
		animal2.describeanimals();
	}

}
