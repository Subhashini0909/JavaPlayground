package control_statement;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int c=0;
		System.out.println(a);
		System.out.println(b);
		while(c<=10)
		{
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
		}
		
		System.out.println("-----------------------For Loop-----------------------");
		int x=0;
		int y=1;
		System.out.println(x);
		System.out.println(y);
		for(int i=0; i<=6;i++)
		{
			int z=x+y;
			System.out.println(z);
			x=y;
			y=z;
		}
	}
}
