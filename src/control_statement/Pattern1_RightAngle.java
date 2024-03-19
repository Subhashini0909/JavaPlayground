package control_statement;

public class Pattern1_RightAngle {

	public static void main(String[] args) {
		int n = 5;
		for(int row =1; row<=5; row++)
		{
			for(int col=1; col<=row;col++)
			{
			System.out.print("* ");
			}
			System.out.println('\n');
		}

	}

}
