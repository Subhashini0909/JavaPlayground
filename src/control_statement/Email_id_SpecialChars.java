package control_statement;

public class Email_id_SpecialChars {

	public static void main(String[] args) {
		
		String email = "worthywe***gmail.com";
		
		boolean hasAt = false;
		boolean hasdot = false;
		
		for(int i=0; i<=email.length()-1; i++)
		{
			char sp = email.charAt(i);
			
			if(sp=='@')
			{
				hasAt = true;
			}
				else if(sp=='.')
				{
					hasdot = true;
				}

			
			if(hasAt && hasdot == true)
				break;
			
		}
		if(hasAt && hasdot == true) {
	        System.out.println("Valid email id");
	    } else {
	        System.out.println("Invalid email");
	    }
	}

}
