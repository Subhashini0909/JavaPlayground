package basic;

import java.util.Scanner;

public class AreaOfRectangle {

//Scanner class at class level
	Scanner sc  = new Scanner(System.in);
	int l; int b;
		/*
		 * System.out.print / System.out.println cannot be used at class level
		 */

	public static void main(String[] args) 
	{
		AreaOfRectangle obj = new AreaOfRectangle();
		obj.calculateArea();

	}

//Constructor to initialize value
	AreaOfRectangle()
	{
	System.out.print("Length : ");
	l = sc.nextInt();
	System.out.print("Breadth : ");
	b = sc.nextInt();
	}

	void calculateArea()
	{
		int Area = l*b;
		System.out.println("Area of Rectangle : " + Area);
	}
}
