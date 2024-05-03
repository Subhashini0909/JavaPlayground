package methods;

import java.util.Scanner;

public class MethodWithScanner {
	
	Scanner sc = new Scanner(System.in);
	int a;
	int b;

	public static void main(String[] args) 
	{
		MethodWithScanner obj = new MethodWithScanner();
		obj.add();
	}
	
	MethodWithScanner()
	{
		System.out.print("Enter A : ");
		this.a = sc.nextInt();
		
		System.out.print("Enter B : ");
		this.b = sc.nextInt();
	}
	
	void add()
	{
		System.out.println(a+b);
	}

}
