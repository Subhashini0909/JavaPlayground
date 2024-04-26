package conditionallogic;

public class Nested_If {

	public static void main(String[] args) 
	{
		int a=0;
		if(a>0)
		{
			if(a<0)
			{
				System.out.println("Negative");
			}
			else
				System.out.println("Positive");
		}
		else
			System.out.println("Zero");

	}

}
