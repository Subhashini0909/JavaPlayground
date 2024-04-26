package constructors;

public class StaticBlock_And_Constructor {

	public static void main(String[] args) 
	{
		StaticBlock_And_Constructor obj = new StaticBlock_And_Constructor();
	}
	static
	{
		System.out.println("Static block");
	}
	
	StaticBlock_And_Constructor()
	{
		System.out.println("Constructor block");
	}

}
/*
 * NOTE : 
 * A static block is executed automatically when the class is loaded into memory, 
 * even without being called explicitly.
*/