package control_statement;

public class Reverse_Number {

	public static void main(String[] args) {
		
		int n=123;
		int r;int rev=0;
		
		while(n>0)
		{
			r=n%10;
				//System.out.println(r); --> This is not the correct way of printing reverse order
			
			n=n/10; 
				//Dividing just to change the value of n. Means 1. n=1234, 2. n=123, 3. n=12, 4. n=1
			
			rev = rev*10+r;
			//System.out.println(rev); --> PRINTS reverse
		}
		System.out.println(rev);

	}

}
