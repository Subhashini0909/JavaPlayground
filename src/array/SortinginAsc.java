package array;

import java.util.Arrays;

public class SortinginAsc {

	public static void main(String[] args) {
		
		System.out.println("--------------------Int---------------------------");
		int a[] = {3,2,1,4,5};
		Arrays.sort(a);
		
		for(int x:a)
			System.out.println(x);
		
		System.out.println("--------------------String---------------------------");
		
		String b[]= {"dssf","dssdf","xcvv","csfds"};
		
		Arrays.sort(b);
		for(String s:b)
			System.out.println(s);
	}

}
