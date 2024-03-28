package strings;

public class StringBuffer_functions {

	public static void main(String[] args) 
	{
		
		StringBuffer a = new StringBuffer("Subha");
		System.out.println("Append : " + a.append("shini"));
			//System.out.println(a);
		System.out.println("Insert : " + a.insert(1, "ashini"));
			//System.out.println(a);
		System.out.println("Delete : " + a.delete(1, 7));
		
		System.out.println();
		
		StringBuilder b = new StringBuilder("Subhashini");
		System.out.println("Append : " + b.append("shini"));
			//System.out.println(b);
		System.out.println("Insert : " + b.insert(1, "ashini"));
			//System.out.println(b);
		System.out.println("Delete : " + b.delete(1, 7));

	}
}

/*
 * StringBuffer and stringBuilder are almost same
 */