package javaconceptsSelenium;

public class SwaptwoNumbers {
	public void withthirdvariable() {
		int mysalary=20;
		int supsalary=50;

		System.out.println("Before Swapping: mysalary: " +mysalary+ " Supsalary: "+supsalary);
		int temp=mysalary;
		mysalary=supsalary;
		supsalary=temp;
		System.out.println("After Swapping: mysalary: " +mysalary+ " Supsalary: "+supsalary);
	}
	
	public void withoutThirdVariable() {
		int first = 20;
		int second = 50;
		System.out.println("Before Swapping: First: " +first+ " Second: "+second);
		first=first-second;
		System.out.println(first);
		second=first+second;
		System.out.println(second);
		first=second-first;
		System.out.println(first);
		System.out.println("After Swapping: First: " +first+ " Second: "+second);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwaptwoNumbers number= new SwaptwoNumbers();
		//number.withthirdvariable();
		number.withoutThirdVariable();
	}

}
