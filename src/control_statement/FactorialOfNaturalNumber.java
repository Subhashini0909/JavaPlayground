package control_statement;

public class FactorialOfNaturalNumber {

	public static void main(String[] args) {
		
		int fact = 1;
		//fact = 1 bcoz if we keep fact =0 then any no multiplied by 0 will be 0.
		
		for(int i=1; i<=5; i++)
		{
			fact = fact*i;
		}
		System.out.println("Factorial : " + fact);

	}

}
