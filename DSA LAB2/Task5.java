//Task5: Write a method in Java program to find the second largest element in an array. Method should take array as input and return index
	import java.util.*;
	public class Task5
	{
		public static int largestSecondElement(int array[])
		{
			int largest=array[0];
			int seclargest=largest;
			for(int i=0; i<array.length; i++)
			{
				if(largest<array[i])
				{
					seclargest=largest;
					largest=array[i];
				}
			}
				return seclargest;
		}
		public static void main(String[] args) 
		{
			int array[]={5,8,3,9,2,60,82,93};
			System.out.println("Second Largest Element is: "+largestSecondElement(array));
		}
	}