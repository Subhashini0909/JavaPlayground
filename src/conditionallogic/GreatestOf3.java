package conditionallogic;

import java.util.Scanner;

public class GreatestOf3 {

	static int a;
	public static void main(String[] args) 
	{
		int b = 200; int c = 500;
		System.out.print("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if (a > b && a > c) 
		{
            System.out.println("A is greatest");
        } 
		else if (b > c) 
        {
            System.out.println("B is greatest");
        } 
		else 
        {
            System.out.println("C is greatest");
        }
	}
}
