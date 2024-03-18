package conditionallogic;

import java.util.Scanner;

public class LeapYear {

	static int year;
	public static void main(String[] args) 
	{
		System.out.print("Enter the year : ");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		
		if(year%4==0)
		{
			System.out.println("The given year is leap year");
		}
		else
		{
			System.out.println("The given year is not a leap year");
		}
	}

}
