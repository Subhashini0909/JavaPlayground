package methods;

public class WithArgument_WithoutReturnType {

	public static void main(String[] args) 
	{
		WithArgument_WithoutReturnType obj = new WithArgument_WithoutReturnType();
		obj.add(5, 5);
	}
	
	void add(int a, int b)
	{
		System.out.println(a+b);
	}

}
