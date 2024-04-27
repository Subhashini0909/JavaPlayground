package control_statement;

public class PrintAlphabetAtoJ {

	public static void main(String[] args) 
	{
		for(char i ='A'; i<='J'; i++)
		{
			System.out.print(i);
			
			if(i!='J')
			{
				System.out.print(", ");
			}
		}

	}

}
