package array;

import java.util.Scanner;

public class MinimumValue {

	public static void main(String[] args) 
	{
		int a[]= {7,3,4,2,6,5};
		
		int min=a[0];
		
		for(int i=0; i<=a.length-1; i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min);
	}

}
