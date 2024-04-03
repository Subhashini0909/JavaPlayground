package interface_;

public class Animal_Dog implements Animal{

	public static void main(String[] args) {
		
		Animal_Dog obj_dog = new Animal_Dog();
		obj_dog.bark();

	}

	@Override
	public void bark() 
	{
		System.out.println("Dog is barking");
	}

}
