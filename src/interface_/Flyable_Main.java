package interface_;

public class Flyable_Main {

	public static void main(String[] args) 
	{
		Flyable_Spacecraft sc = new Flyable_Spacecraft();
		sc.fly_obj();
		
		Flyable_Airplane ap = new Flyable_Airplane();
		ap.fly_obj();
		
		Flyable_Helicopter hc = new Flyable_Helicopter();
		hc.fly_obj();
		
		
		System.out.println("------------USING FOR EACH---------------");
		
		Flyable[] object = {new Flyable_Spacecraft(), new Flyable_Airplane(), new Flyable_Helicopter()};
		
		for(Flyable obj : object)
		{
			obj.fly_obj();
		}

	}

}
