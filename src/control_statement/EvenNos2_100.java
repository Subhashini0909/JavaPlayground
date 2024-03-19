package control_statement;

public class EvenNos2_100 {

	public static void main(String[] args) {
		
		System.out.println("Using For Loop");
		for(int i=2; i<=20; i=i+2)
		{
			System.out.print(i +", ");
		}
		
		
		System.out.println('\n');
		System.out.println("Using While Loop");
		int j = 2;
		while(j<=20)
		{
			System.out.print(j + ", ");
			j=j+2;
		}
		
		System.out.println('\n');
		System.out.println("Using Do While Loop");
		int x=2;
		do
		{
			System.out.print(x + ", ");
			x=x+2;
		}
		while(x<=20);
	}

}
