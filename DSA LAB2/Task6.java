//Task6: Write a java program to sort a matrix (Two dimensional array)
	import java.util.*;
	public class Task6
	{
		public static void main(String[] args)
		{
			int[][] array = {{4,5,8},{3,9,8}};
			for(int a=0; a<array.length; a++)
			{
				Arrays.sort(array[a]);
			}
			print2DArray(array);
		}
		public static void print2DArray(int arr[][])
		{
			for(int b=0; b<arr.length; b++){
				for(int a=0; a<arr[b].length; a++)
				{
					System.out.print(arr[b][a]+" ");
				}
				System.out.println("");
			}
		}
	}