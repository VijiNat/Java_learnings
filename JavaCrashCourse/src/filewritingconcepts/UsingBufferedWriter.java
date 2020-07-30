package filewritingconcepts;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UsingBufferedWriter {

	public static void main(String[] args) throws IOException {
		String location = "UsingBufferedWriter.txt";
		String content = "Break your insecurities and fear and ask guidance from God";
		
		FileWriter file=new FileWriter(location);
		BufferedWriter bwriter = new BufferedWriter(file);
				bwriter.write(content);
				bwriter.close();
		

	}

}
