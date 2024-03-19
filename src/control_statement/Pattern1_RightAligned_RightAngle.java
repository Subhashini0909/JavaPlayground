package control_statement;

public class Pattern1_RightAligned_RightAngle {

	public static void main(String[] args) 
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=(5-i)*2; j>=1; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println('\n');
		}
		
		
	}

}
