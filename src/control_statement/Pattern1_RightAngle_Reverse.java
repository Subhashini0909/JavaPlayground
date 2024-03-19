package control_statement;

public class Pattern1_RightAngle_Reverse {

	public static void main(String[] args) {
		
		//----------------Horizontal
		for(int r = 5;r>=1; r--)
		{
			//Vertical
			for(int c=1; c<=r; c++)
			{
				System.out.print("* ");
			}
			System.out.println('\n');
		}
	}
}
