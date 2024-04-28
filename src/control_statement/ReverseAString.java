package control_statement;

public class ReverseAString {

	public static void main(String[] args) 
	{
		String str = "Hello";
		
		char a[] = str.toCharArray();
		
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.print(a[i]);
		}
	}

}
