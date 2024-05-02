package array;

import java.util.Arrays;

public class Max_Min_UsingSort {

	public static void main(String[] args) {
		
		int a[] = {1,3,5,7,2,4,6};
		Arrays.sort(a);
		System.out.println("Maximum value : " + a[a.length-1]);
		System.out.println("Minimum Value : " + a[0]);
		System.out.println();
		
		for(int b :a)
		{
			System.out.println(b);
		}

	}

}
