package methods;

public class WithoutArgument_WithReturnType {

	public static void main(String[] args) 
	{
		WithoutArgument_WithReturnType obj = new WithoutArgument_WithReturnType();
		int total = obj.add();
		System.out.println(total);
	}
	
	int add()
	{
		int a=10;
		int b=10;
		
		return a+b;
		
	}

}
