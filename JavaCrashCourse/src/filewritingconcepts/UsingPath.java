package filewritingconcepts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UsingPath {

	public static void main(String[] args) throws IOException {
		
		String location = "UsingPath.txt";
		String content = "There is no age for learning new things! Do not feel shy to try new things!";
		
		Path filepath = Paths.get(location);
		Files.write(filepath,content.getBytes());
		
		
	}

}
