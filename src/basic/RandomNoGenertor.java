package basic;

import java.util.Random;

public class RandomNoGenertor {

	public static void main(String[] args) 
	{
		Random ran = new Random();	
		
		int random_ = ran.nextInt(201);
		
		System.out.println(random_);
	}

}
