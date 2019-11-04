/*Task7: Write a Java program to remove the duplicate elements of a given array and return the new length of the array.
Sample array: [20, 20, 30, 40, 50, 50, 50] 
After removing the duplicate elements the program should return 4 as the new length of the array.*/
	import java.util.*;
	public class Task7
	{
		public static void main(String[] args) 
		{
			int array[]={20,20,30,40,50,50,50};
			int unique_elements=array.length;
			for(int i=0; i<unique_elements; i++)
			{
				for(int j=i+1; j<unique_elements; j++)
				{
					if(array[i]==array[j])
					{
						array[j]=array[unique_elements-1];
						unique_elements--;
						j--;
					}
				}
			}
			int[] array1 = Arrays.copyOf(array, unique_elements);
         
        		System.out.println();
         
       			System.out.print("Array with unique values : ");
        
        		for (int i = 0; i < array1.length; i++)
       			{
           			System.out.print(array1[i]+"\t");
       			}
         
        	System.out.println();
         
			System.out.println("New Length of Array is: "+unique_elements);
		}
	}