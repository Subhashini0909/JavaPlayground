package control_statement;

public class SumOfNaturalNumbers {
	int sum; //Non-static variable can be used inside a static method using object
	public static void main(String[] args) {
		SumOfNaturalNumbers obj = new SumOfNaturalNumbers();
		
		//int sum =0; //Local variable cannot be used unassigned
		for(int i=1; i<=5; i++)
		{
			obj.sum = obj.sum+i;
			//System.out.println(sum);
		}
		
		System.out.println("The sum is : " + obj.sum);

	}

}
