package oops;

public class Super_Keyword_Constructor_Parent {
	int a;
	Super_Keyword_Constructor_Parent(int x)
	{
		this.a=x;
		System.out.println("A : " + a);
	}
	
	Super_Keyword_Constructor_Parent()
	{
		System.out.println("Non-Parameterized Constructor from Parent class");
	}
}