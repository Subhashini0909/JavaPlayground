package array;

public class MaximumValue {

	public static void main(String[] args) 
	{
		int a[] = {9,5,3,10,23,33};
		int max=a[0];
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
