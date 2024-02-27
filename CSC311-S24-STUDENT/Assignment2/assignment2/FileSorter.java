package assignment2;
//Isaias Chavarin Velasquez (ichavarinvelasquez1@toromail.csudh.edu)

import java.util.Scanner;
import java.io.IOException;
public class FileSorter 
{
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter the input file name
	        System.out.print("Enter the name of the input file: ");
	        String inputFile = scanner.nextLine();

	        // Prompt the user to enter the output file name
	        System.out.print("Enter the name of the output file: ");
	        String outputFile = scanner.nextLine();

	        // Read numbers from the input file
	        NumberFileReader reader = new NumberFileReader(inputFile);
	        int[] numbers;
	        try {
	            numbers = reader.read();
	        } catch (IOException e) {
	            System.err.println("Error reading input file: " + e.getMessage());
	            return;
	        }

	        // Sort the numbers using Bubble Sort
	        BubbleSort sorter = new BubbleSort(numbers);
	        int[] sortedNumbers = sorter.sortAsc();

	        // Write the sorted numbers to the output file
	        NumberFileWriter writer = new NumberFileWriter(outputFile);
	        try {
	            writer.write(sortedNumbers);
	            System.out.println("Sorted numbers have been written to " + outputFile);
	        } catch (IOException e) {
	            System.err.println("Error writing to output file: " + e.getMessage());
	        }
	    }

}
