package interface_;

public class Shape_Main {

	public static void main(String[] args) {
		
		Shape_Rectangle rect = new Shape_Rectangle(10,10);
		System.out.println("Rectangle : " + rect.getArea());
		
		Shape_Circle circle= new Shape_Circle(10,3.14f);
		System.out.println("Circle : " + circle.getArea());
		
		Shape_Triangle Tri = new Shape_Triangle(0.5f, 10,10);
		System.out.println("Triangle : " + Tri.getArea());

	}

}
