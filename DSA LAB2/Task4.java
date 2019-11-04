//Taks4: Write a method in java with float as its return type that takes array as input and return average as output.
	import java.util.*;
	public class Task4
	{
		public static void main(String[] args) 
		{
			int array[]={3,6,9,12,7,8};
			double average;
			int sum=0;
			for(int a=0; a<array.length; a++)
			{
				sum=sum+array[a];
			}
			average=sum/array.length;

			System.out.println(average);
		}
	}