public class Main {

	public static void main(String[] args) {

		Shape s0 = new Shape(1, 1);
		System.out.println(s0.getArea());

		Shape s1, s2;
		s1 = new Circle(1, 1, 2);
		s2 = new Rect(2, 2, 3, 4);

		String m1 = s1.toString();
		System.out.println(m1);
		System.out.println("Area of s1 = " + s1.getArea());
		System.out.println(s2.toString());
		System.out.println("Area of s2 = " + s2.getArea());

	}
	
}