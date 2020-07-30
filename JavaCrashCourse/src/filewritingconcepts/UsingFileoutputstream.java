package filewritingconcepts;

import java.io.FileOutputStream;
import java.io.IOException;

public class UsingFileoutputstream {

	public static void main(String[] args) throws IOException {
		
		String location = "UsingFOS.txt";
		String content = "Joy of the LORD is my Strength";
		
		FileOutputStream stream=new FileOutputStream(location);
		byte[] bytearray = content.getBytes();
		stream.write(bytearray);
		stream.close();		

	}

}
