package control_statement;

public class PrimeNo {

	public static void main(String[] args) 
	{
		int n =9;
		int flag=0;
		
		for(int i=2; i<=n-1; i++)
		{
			if(n%i==0)
			{
				System.out.println("Composite No");
				flag =1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Prime no");
		}
	}

}
