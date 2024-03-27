package strings;

public class Split {

	public static void main(String[] args) 
	{
		String c = "I am Subhashini";
		System.out.println("Split based on space: ");
		String[] splited = c.split(" ");
		for(String splitted : splited)
		{
			System.out.println(splitted);
		}
	}

}
