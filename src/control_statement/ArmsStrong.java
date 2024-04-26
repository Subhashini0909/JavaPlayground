package control_statement;

import java.util.Scanner;

public class ArmsStrong {

	public static void main(String[] args) 
	{
		System.out.print("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int copy=a; //This copies intial value of a
		int r=0;
		int sum =0;
		
		while(a>0)
		{
			r=a%10;
			a=a/10;
			sum = sum+(r*r*r);
			
		}
		System.out.println(sum);
		
		if(copy==sum)
			System.out.println("The given no is Armstrong");
		else
			System.out.println("The given no is not an Armstrong");
	}

}
