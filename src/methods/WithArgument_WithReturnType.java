package methods;

public class WithArgument_WithReturnType {

	public static void main(String[] args) 
	{
		WithArgument_WithReturnType obj = new WithArgument_WithReturnType();
		int total = obj.add(5, 5);
		System.out.println("Addition : " + total);


	}
	
	int add(int a , int b)
	{
		return a+b;
	}

}
