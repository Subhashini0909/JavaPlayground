package control_statement;

public class RightTriangleWithOuterLoop {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++) //For every iteration j will start from 1
			{
				System.out.print(i+" "); //Printing Outer Loop
			}
			System.out.println();
		}
		System.out.println("...............................");
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++) 
			{
				System.out.print(j+" "); //Printing Inner Loop
			}
			System.out.println();
		}

	}

}
/*
When i is 1, j starts from 1 and goes up to 1, printing 1 once.
When i is 2, j starts from 1 and goes up to 2, printing 2 2.
When i is 3, j starts from 1 and goes up to 3, printing 3 3 3.
When i is 4, j starts from 1 and goes up to 4, printing 4 4 4 4.
When i is 5, j starts from 1 and goes up to 5, printing 5 5 5 5 5.
*/