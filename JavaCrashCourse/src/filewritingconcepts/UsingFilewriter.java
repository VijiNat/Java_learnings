package filewritingconcepts;

import java.io.FileWriter;
import java.io.IOException;

public class UsingFilewriter {

	public static void main(String[] args) throws IOException {
		String location = "UsingFilewriter.txt";
		String content = "Learning automation is possible for anyone";
		
		FileWriter fwriter = new FileWriter(location);
		fwriter.write(content);
		fwriter.close();

	}

}
