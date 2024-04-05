package exception_handling;

public class Arithmetic_Exception {

	public static void main(String[] args){
		int c=0;
		try
		{
		int a=5;
		int b=0;
		c=a/b;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(c);

	}

}
