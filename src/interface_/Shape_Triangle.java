package interface_;

public class Shape_Triangle implements Shape
{
	float half; 
	int b;
	int h;

	Shape_Triangle(float half, int b, int h)
	{
		this.half = half;
		this.b = b;
		this.h = h;
	}

	@Override
	public int getArea() 
	{
		return (int) (half*b*h);
	}

}
