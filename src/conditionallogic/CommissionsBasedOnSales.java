package conditionallogic;

import java.util.Scanner;

public class CommissionsBasedOnSales {
	
	static int sales;

	public static void main(String[] args) 
	{
		System.out.print("Enter the sales : ");
		Scanner sc = new Scanner(System.in);
		sales = sc.nextInt();
		
		if(sales<1000)
		{
			System.err.println("Sales target should be achieved");
		}
		else if(sales>=1000 && sales<2000)
		{
			System.out.println("Congrats, You have earned a commission of 100");
		}
		else if(sales>=2000 && sales<3000)
		{
			System.out.println("Congrats, You have earned a commission of 200");
		}
		else
		{
			System.out.println("Congrats, You have earned a commission of 300");
		}
		
	}

}
