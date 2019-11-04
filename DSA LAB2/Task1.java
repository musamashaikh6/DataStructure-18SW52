//Task1: Write a Java Code a Array of length 100 and fill it with Random int Values for testing purpose.
    import java.util.*;
    public class Task1
		{
			public static void main(String[] args) 
			{
				int [] arr=new int[100];
				int insert=0;
					for(int a=0; a<100; a++)
						{
							arr[a]=insert;
							insert=insert+3;
						}

				System.out.println(Arrays.toString(arr));
			}
		}