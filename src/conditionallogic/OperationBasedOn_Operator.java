package conditionallogic;

import java.util.Scanner;

public class OperationBasedOn_Operator {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter operator (+, -, *, /): ");
		String User_Operator = sc.next();
		
		System.out.print("Num 1 : ");
		int a = sc.nextInt();
		
		System.out.print("Num 2 : ");
		int b = sc.nextInt();
		
		switch(User_Operator)
		{
		case "+" :
			System.out.println(a+b);
			break;

		case "-" :
			System.out.println(a-b);
			break;
		
		case "*" :
			System.out.println(a*b);
			break;

		case "/" :
			System.out.println(a/b);
			break;
		
		default :
			System.out.println("Enter valid numbers or operator");
}
}
}
