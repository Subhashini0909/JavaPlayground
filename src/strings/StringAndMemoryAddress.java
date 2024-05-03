package strings;

public class StringAndMemoryAddress {

	public static void main(String[] args) 
	{
		String s = "abc";
		System.out.println("Memory address for the value abc : " + s.hashCode());
		
		s = "def";
		System.out.println("Memory address for the value def : " + s.hashCode());
		
		System.out.println();
		
		String s1 = new String ("mno");
		System.out.println("Memory address for the value mno : " + s1.hashCode());
		
		s1 = new String ("pqr");
		System.out.println("Memory address for the value pqr : " + s1.hashCode());
	}

}
