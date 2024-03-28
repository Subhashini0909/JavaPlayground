package strings;

public class Functions {

	public static void main(String[] args) {
		
		String a = "Subha";
		String b = new String("SubhaSHINI");
		
		System.out.println("Length : " + a.length());
		System.out.println("To Lowercase : " + a.toLowerCase());
		System.out.println("To Uppercase : " + a.toUpperCase());
		System.out.println("CharAt : " + a.charAt(4));
		System.out.println("Index of : " + b.indexOf('I'));
		System.out.println("Index of : " + b.indexOf('i')); //i is not in the given string so it will return -1
		System.out.println("Last index of : " + b.lastIndexOf('I'));
		System.out.println("Equals : " + a.equals(b));
		System.out.println("Concat : " + a.concat(b));
		System.out.println("Substring : " + b.substring(0));
		System.out.println("Substring : " + b.substring(0, 5));
		
		System.out.println("isEmpty : " + a.isEmpty());
		System.out.println("isBlank: " + a.isBlank());
		System.out.println("Contains : " + b.contains(a));
		System.out.println("Endswith : " + b.endsWith("INI"));
		
		System.out.println(a);
		
		
	}

}
