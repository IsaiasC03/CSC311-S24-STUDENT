package assignment2;
//Isaias Chavarin Velasquez (ichavarinvelasquez1@toromail.csudh.edu)

import java.util.Scanner;
import java.io.IOException;
public class FileSorter 
{
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int pickingOrder;
	        
	        System.out.print("Enter the name of the input file: ");
	        String inputFile = scanner.nextLine();
	        
	        System.out.print("Enter the name of the output file: ");
	        String outputFile = scanner.nextLine();
	        
	        System.out.println("Type 1 for acsending order. Type 2 for decsending order");
	        pickingOrder = scanner.nextInt();
	        
	        NumberFileReader reader = new NumberFileReader(inputFile);
	        int[] numbers;
	        try 
	        {
	            numbers = reader.read();
	        } 
	        catch (IOException e) 
	        {
	            System.err.println("Error reading input file: " + e.getMessage());
	            return;
	        }
	        
	        BubbleSort sorter = new BubbleSort(numbers);
	        int[] sortedNumbersAsc = sorter.sortAsc();
	        
	        int[] sortedNumbersDesc = sorter.sortDesc();
	        
	        NumberFileWriter writer = new NumberFileWriter(outputFile);
	        try 
	        {
	        	if(pickingOrder == 1)
	        	{
	        		writer.write(sortedNumbersAsc);
	        		System.out.println("Numbers have been sorted in Acsending order in " + outputFile);
	        	}
	        	if(pickingOrder == 2)
	        	{
	        		writer.write(sortedNumbersAsc);
	        		System.out.println("Numbers have been sorted in Decsending order in  " + outputFile);
	        	}
	        } 
	        catch (IOException e) 
	        {
	            System.err.println("Error writing to output file: " + e.getMessage());
	        }
	    }

}
