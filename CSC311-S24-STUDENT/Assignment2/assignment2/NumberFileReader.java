package assignment2;
//Isaias Chavarin Velasquez (ichavarinvelasquez1@toromail.csudh.edu)

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class NumberFileReader
{
	private String fileName;
	
	public NumberFileReader(String fileName)
	{
		this.fileName = fileName;
	}
	
	public int[] read() throws IOException
	{
		int count=0;
		int[] numbersArray = new int[count];
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName)))
		{
			while(reader.readLine() != null)
			{
				count++;
			}
					;
			String line;
			int index = 0;
			while((line =  reader.readLine()) != null)
			{
				int number = Integer.parseInt(line.trim());
				numbersArray[index++] = number;
			}
		}
		
		return numbersArray;
	}
		
	

}
