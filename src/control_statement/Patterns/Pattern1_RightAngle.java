package control_statement.Patterns;

public class Pattern1_RightAngle {

	public static void main(String[] args) {
		
		for(int row =1; row<=5; row++)
		{
			for(int col=1; col<=row;col++)
			{
			System.out.print("* ");
			}
			System.out.print('\n');
		}
	}

}
