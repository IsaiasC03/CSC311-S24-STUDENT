package assignment2;
//Isaias Chavarin Velasquez (ichavarinvelasquez1@toromail.csudh.edu)

public class BubbleSort 
{
	private int[] array;
	private int loopCycles;
	
	public BubbleSort(int[]array)
	{
		this.array= new int[array.length];
		for (int i=0; i < array.length; i++)
		{
			this.array[i] = array[i];
		}
	}
	
	public int[] sortAsc() 
	{
        bubbleSort(true);
        return array;
    }
	
    public int[] sortDesc() 
    {
        bubbleSort(false);
        return array;
    }
    
    public int loopCycles() 
    {
        return loopCycles;
    }
    
    private void bubbleSort(boolean ascending) 
    {
        loopCycles = 0;
        for (int i = 0; i < array.length - 1; i++) 
        {
            for (int j = 0; j < array.length - i - 1; j++) 
            {
                if (ascending ? array[j] > array[j + 1] : array[j] < array[j + 1]) 
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                loopCycles++;
            }
        }
    }
    //using a bubbleSort method to be able to sort ascending and descending without taking a array as a argument
}
