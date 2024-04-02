package oops;

public class Super_Keyword_Constructor_Child extends Super_Keyword_Constructor_Parent{

	public static void main(String[] args) 
	{
		Super_Keyword_Constructor_Child obj = new Super_Keyword_Constructor_Child(10,30);
		//obj.show();

	}
	int b;
	Super_Keyword_Constructor_Child(int x, int y)
	{
		super(x);
		this.b=y;
		System.out.println("B : " + b);
	}
	
}
