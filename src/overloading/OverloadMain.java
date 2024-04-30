package overloading;

public class OverloadMain {
	
	
	public static void main(String[] args) 
	{
		OverloadMain obj = new OverloadMain();
		obj.main("Hi.. I'm from method 1");
		obj.main(2);
	}
	
	public void main(String a)
	{
		System.out.println(a);
	}
	
	public static void main(int b)
	{
		System.out.println("Hi.. I'm from method "+ b);
	}

}
/*
 * NOTE : Main method can be overloaded but JVM consider
 * public static void main(String[] args) as the execution point
 */
