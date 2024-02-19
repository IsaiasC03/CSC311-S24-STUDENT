package assignment1;
//Isaias Chavarin Velasquez (ichavarinvelasquez1@toromail.csudh.edu)

public class NumberArrayList 
{
	private int maxSize;
	private int size;
	private int[] myArray;
	
	public NumberArrayList(int size)
	{
		this.myArray = new int[size];
		
	}
	
	public int add(int number)
	{
		if(size < maxSize)
		{
			myArray[size++] = number;
		}
		return size-1;
	}
	
	public int get(int index)
	{
		return myArray[index];
	}
	
	public int size()
	{
		return size;
	}
	
	public int[] find(int number)
	{
		int counter =0;
		for(int i=0; i<size; i++)
		{
			if(myArray[i] == number)
			{
				counter++;
			}
		}
		
		int[] indices = new int[counter];
		int indicesIndex = 0;
		for(int i =0;i< size; i++)
		{
			if(myArray[i] == number)
			{
				indices[indicesIndex++] = i;
			}
		}
		return indices;
	}
	
	public int getLargest()
	{
		int largest=0;

		for(int x=0;x<myArray.length;x++) {
		
			if(myArray[x]>largest)
			{
				largest = myArray[x];
			}
		}
		return largest;
	}
	
	public int getSmallest()
	{
		int smallest= getLargest();

		for(int x=0;x<myArray.length;x++) 
		{
		
			if(myArray[x]<smallest)
			{
				smallest=myArray[x];
			}
		}
		return smallest;
	}
	
	public int getAverage()
	{
		if(size == 0)
		{
			return -1;
		}
		
		int average = 0;
		for(int i=0; i < size; i++)
		{
			average += myArray[i];
		}
		return average/size;
	}
	
	public String toString() //used to print the ArrayList with ", " between each number
	{
		String results = "";
		
		for(int i=0; i<size; i++)
		{
			results += myArray[i] + ", ";
			
		}
		if(size >0)
		{
			results += myArray[size - 1];
		}
		return results;
	}
}
