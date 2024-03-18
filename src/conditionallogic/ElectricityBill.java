package conditionallogic;

import java.util.Scanner;

public class ElectricityBill {
	
	static int unit;

	public static void main(String[] args) 
	{
		System.out.print("Enter the units consumed : ");
		Scanner sc = new Scanner(System.in);
		unit = sc.nextInt();

		if(unit<=100)
		{
			System.out.println("Your bill amount is : " + unit*1 + "$");
		}
		else if(unit>100 && unit<=200)
		{
			System.out.println("Your bill amount is : " + unit*2 + "$");
		}
		else
		{
			System.out.println("Your bill amount is : " + unit*3 + "$");
		}
	}

}
