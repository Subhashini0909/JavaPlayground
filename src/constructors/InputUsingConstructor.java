package constructors;

public class InputUsingConstructor {
	
	String name;
	int age;
	int id;

	public static void main(String[] args) 
	{
		InputUsingConstructor obj = new InputUsingConstructor();
		obj.print_details();

	}
	
	InputUsingConstructor()
	{
		name = "Subha";
		age = 24;
		id = 1;
	}
	
	void print_details()
	{
		System.out.println("Name : " + name + "\n" + "Age : " +age + "\n" + "Id : " + id);
	}
	

}
