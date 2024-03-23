package control_statement.Patterns;

public class Pattern_5times {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) //Vertical Line - Row
		{
			for(int j=1; j<=3; j++) //Horizontal Line - Columns
			{
			System.out.print("*\t");
			}
			System.out.println();
			
		}
	}

}
