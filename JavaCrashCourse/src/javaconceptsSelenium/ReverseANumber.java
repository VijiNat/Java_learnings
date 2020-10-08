package javaconceptsSelenium;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int givennum = 1234567;
		int reversed=0;
		
		while(givennum!=0) {
			reversed=reversed*10;
			reversed=reversed+givennum%10;
			givennum=givennum/10;
		}
		System.out.println(reversed);

	}

}
