package interface_;

import java.util.Scanner;

public class Shape_Circle implements Shape{

	float pi;
	int r;
	
	Shape_Circle(int r,float pi)
	{
		this.pi = pi;
		this.r = r;
	}
	
	@Override
	public int getArea() 
	{
		
		float Area_Circle = pi*r*r;
		return (int) Area_Circle;
		
	}

}
