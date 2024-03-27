package strings;

public class StringBuffer_Functions {

	public static void main(String[] args) {
		
		String a = "Subha";
		StringBuffer b = new StringBuffer("SubhaSHINI");
		System.out.println("B before changing : " + b.hashCode());
		b= new StringBuffer("Subhashini");
		System.out.println("B after changing : " + b.hashCode());
		System.out.println(b.reverse());

	}

}
