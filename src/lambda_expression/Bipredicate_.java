package lambda_expression;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Bipredicate_ {

	public static void main(String[] args) {
		 
		BiPredicate<Integer, Integer> a = (x,y)->(x==y);
		System.out.println("BiPredicate : " + a.test(1, 2));
		
		BiFunction<Integer, Integer, Integer> b = (x,y) -> (x+y);
		System.out.println("BiFunction : " + b.apply(2, 2));
		
		BiConsumer<String, Integer> c = (n,m)-> 
		c.accept("Subha", 10);
		
	
		

	}

}
