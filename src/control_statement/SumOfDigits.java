package control_statement;

public class SumOfDigits {

	public static void main(String[] args) {
		
		int a = 123;
		int sum =0;
		int r=0;
		
		while(a>0)
		{
			r=a%10;
			sum = sum+r;
			a=a/10;
		}
		System.out.println("The sum of the given digit is : " + sum);
	}
}

/*
 * 1. r=3, sum=3, a=12
 * 2. r=2, sum=5, a=1
 * 3. r=1, sum=6, a=0
 */
