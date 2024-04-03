package interface_;

public class Shape_Rectangle implements Shape {

	int l;
	int b;

	Shape_Rectangle(int l, int b)
	{
		this.l = l;
		this.b = b;
	}
	public int getArea() 
	{
		int Area_Rectangle = l*b;
		return Area_Rectangle;
	}

}
