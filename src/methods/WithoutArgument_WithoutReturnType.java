package methods;

public class WithoutArgument_WithoutReturnType {

	public static void main(String[] args) 
	{
		WithoutArgument_WithoutReturnType obj = new WithoutArgument_WithoutReturnType();
		obj.add();
	}
	
	void add()
	{
		int a = 5;
		int b = 5;
		
		System.out.println(a+b);
	}

}
