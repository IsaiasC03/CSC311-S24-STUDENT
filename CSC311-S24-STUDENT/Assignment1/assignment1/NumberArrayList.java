package assignment1;
//Isaias Chavarin Velasquez (ichavarinvelasquez1@toromail.csudh.edu)

public class NumberArrayList 
{
	private int maxSize
	private int size;
	private int[] myArray;
	
	public NumberArrayList(int size)
	{
		this.myArray = new int[size];
		
	}
	
	public int add(int number)
	{
		if (size < maxSize)
		{
			myArray[size++] = number;
		}
		return size-1;
	}
	
	public int get(int index)
	{
		if (index >= 0 && index < size)
		{
			return myArray[index];
		}
	}
	
	public int size()
	{
		return size;
	}
	
	public int[] find(int number)
	{
		
	}
	
	public int getLargest()
	{
		
	}
	
	public int getSmallest()
	{
		
	}
	
	public int getAverage()
	{
		
	}
}
