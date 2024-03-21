package control_statement;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		
		int sum =0;
		for(int i=1; i<=5; i++)
		{
			sum = sum+i;
			System.out.println(sum);
		}
		
		System.out.println("The sum is : " + sum);

	}

}
