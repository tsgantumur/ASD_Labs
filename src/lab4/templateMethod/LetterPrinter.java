package lab4.templateMethod;

import java.io.BufferedReader;
import java.io.IOException;

public abstract class LetterPrinter {
	
	public final void printLetter(String fl)
	{
		readData(fl);
		
		getType();
		
		construct();
		
		print();
	}
	
	private void readData(String file)
	{
		BufferedReader reader;
		try {
			reader = new BufferedReader(new java.io.FileReader(file));
			
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				// read next line
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public abstract String getType();
	
	public abstract void construct();
	
	public abstract void print();
}
