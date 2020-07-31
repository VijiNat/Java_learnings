package filereadingoperations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsingBufferedReader {

	public static void main(String[] args) throws IOException {
		
		String location = "UsingBufferedWriter.txt";
		
		FileReader fReader= new FileReader(location);
		BufferedReader bReader = new BufferedReader(fReader);
		String text;
		while((text=bReader.readLine())!=null) {
			System.out.println(text);	
		}
		bReader.close();		
	}

}
