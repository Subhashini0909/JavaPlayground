package control_statement;

public class OddNumber {

	public static void main(String[] args) 
	{
		System.out.print("List of ODD no's with if : ");
		for(int i=1; i<=100; i++)
		{
			if(i%2!=0)
			System.out.print(i +", ");
		}
		System.out.println('\n');
		
		System.out.print("List of ODD no's without if : ");
		for(int j=1; j<=100; j=j+2)
		{
			System.out.print(j +", ");
		}

	}

}
