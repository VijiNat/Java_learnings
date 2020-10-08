package javaconceptsSelenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseAString {
	
	public void usingStringbuffer() {
		String given ="AGNI";
		StringBuffer buffer=new StringBuffer();
		buffer.append(given);
		System.out.println(buffer.reverse());
	}
	public void usingOwnLogic() {
		String given = "AGNI";
		String reversed ="";
		char[] array=given.toCharArray();
		for(int i=array.length-1;i>=0;i--) {
			reversed= reversed + array[i];
		}
		System.out.println(reversed);
	}
	public void usingCollections() {
		String given = "AGNI";
		char[] array=given.toCharArray();
		List<Character> list = new ArrayList<Character>();
		for (Character character : array) {
			list.add(character);
		}
		Collections.reverse(list);
		ListIterator<Character> iterator = list.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseAString aString = new ReverseAString();
		//aString.usingStringbuffer();
		//aString.usingOwnLogic();
		aString.usingCollections();
	}

}
