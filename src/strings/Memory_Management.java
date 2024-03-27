package strings;

public class Memory_Management {

	public static void main(String[] args) {
		
		String a = "Subha";
		String b = "Subha";
		
		//System.out.println("A : " + a.hashCode());
		
		System.out.println("String Literals are immutable");
		System.out.println("B before changing : " + b.hashCode());
		
	System.out.println("-----------------------CHANGING VALUE OF B-------------------------------");
		b="subha";
		System.out.println("B after changing: " + b.hashCode());
		
System.out.println("----------------------------------------------------------------");
		
//		if (a==c)
//				{
//			System.out.println("Strings are not equal because A is stored in string pool memory, whereas C is stored in heap");
//				}
//		if(a==b)
//		{
//			System.out.println("Strings are equal because A and B are stored in heap");
//		}
		

	}

}
