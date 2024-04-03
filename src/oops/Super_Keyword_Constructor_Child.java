package oops;

public  class Super_Keyword_Constructor_Child extends Super_Keyword_Constructor_Parent{

	public static void main(String[] args) 
	{
		Super_Keyword_Constructor_Child obj = new Super_Keyword_Constructor_Child(10,30);
		Super_Keyword_Constructor_Child obj1 = new Super_Keyword_Constructor_Child();

	}
	int b;
	Super_Keyword_Constructor_Child(int x, int y)
	{
		super(x); //Parameterized Constructor Call
		this.b=y;
		System.out.println("B : " + b);
	}
	Super_Keyword_Constructor_Child()
	{
		super(); //Non-Parameterized Constructor call
		System.out.println("Non-Parameterized Constructor from Child class");
		//super(); - ERROR - Constructor call must be the first statement in the constructor
	}
	
}
