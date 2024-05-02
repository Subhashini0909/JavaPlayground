package conditionallogic;

public class MaximumOf3 {

	public static void main(String[] args) 
	{
		int a = 100; int b =70; int c = 30;
		
		if(a>b && a>c)
		{
			System.out.println("A is greater");
		}
		else if(b>c)
		{
			System.out.println("B is greater");
		}
		else
			System.out.println("C is greater");
	}

}
