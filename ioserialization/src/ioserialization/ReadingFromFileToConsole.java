package ioserialization;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFileToConsole {
	public static void main(String[] args) throws IOException {
		
		FileReader reader= new FileReader("D:\\ustcore\\ioserialization\\src\\ioserialization\\KeyboardToFile.java"); //reading from the file
		BufferedReader buffer = new BufferedReader(reader);
		//buffer is for optimization;instead of making several trips to source; they always allocate extra space.
		String data = buffer.readLine();
		while(data != null) {
			System.out.println(data);
			data= buffer.readLine();
		}
		reader.close();
		buffer.close();
	}
	
}
