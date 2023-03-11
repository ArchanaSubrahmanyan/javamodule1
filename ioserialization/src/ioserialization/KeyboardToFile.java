package ioserialization;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardToFile {

	public static void main(String[] args) throws IOException {
		System.out.println("Entered main");
		String data = null;
		InputStreamReader isr = new InputStreamReader(System.in); // keyboard is connected to InputStreamReader
		BufferedReader reader = new BufferedReader(isr); // InputStreamReader is connected to BufferedReader
		
		FileWriter writer = new FileWriter("Nammadafile.txt"); // to give the input to file
		System.out.println("Enter some text");
		data = reader.readLine();
		while (!data.equals("quit")) {  //take multiple line as input

			//System.out.println("you have entered " + data);
			writer.write(data);
			data = reader.readLine(); // main is blocked here till we give some input..it will take one line as input

		}
		writer.flush();
		writer.close();
		reader.close();
		System.out.println("Exit main");
	}

}
