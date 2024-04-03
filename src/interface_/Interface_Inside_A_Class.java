package interface_;

public class Interface_Inside_A_Class{

	public static void main(String[] args) 
	{
		int value = B.i;
		System.out.println(value);

	}
	
	interface B
	{
		int i=10;
	}

}

