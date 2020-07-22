package com.la.javaLearning;

public class ConstructorOverloading {
	
	String shape;
	
	ConstructorOverloading(){
		System.out.println("Shape object created");
	}
	
	ConstructorOverloading(String shapetype){
		shape=shapetype;
		System.out.println("Drawing " +shapetype);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading shapepattern = new ConstructorOverloading();
		ConstructorOverloading shapepattern1 = new ConstructorOverloading("Circle");
	}

}
