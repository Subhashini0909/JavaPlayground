package control_statement;

public class CountVowels {

	public static void main(String[] args) 
	{
		String name = "Subhashini";
		int count =0;
		
		
		for(int i=0;i<=name.length()-1; i++)
		{
			char name_char = name.charAt(i);
			
			if(name_char == 'A' || name_char=='a' || name_char == 'E'|| name_char == 'e'|| name_char == 'I'|| 
					name_char == 'i'|| name_char == 'O'|| name_char == 'o'|| name_char == 'U'|| name_char == 'u')
			{
				count ++;
			}
			
		}
		System.out.println("No.of vowels in the given string " +name + " is " +count);
	}

}
