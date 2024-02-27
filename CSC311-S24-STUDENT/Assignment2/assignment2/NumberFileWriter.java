package assignment2;
//Isaias Chavarin Velasquez (ichavarinvelasquez1@toromail.csudh.edu)

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;
public class NumberFileWriter 
{
	private String fileName;
	
	public NumberFileWriter(String fileName)
	{
		this.fileName = fileName;
		
	}
	
	public void write (int[] arrayOfNumbers) throws IOException
	{
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) 
		{
            for (int number : arrayOfNumbers)
            {
                writer.write(String.valueOf(number));
                writer.newLine();
            }
		}
	}

}
