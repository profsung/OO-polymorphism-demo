public class Main {

	public static void main(String[] args) {

		// Shape s0 = new Shape(1, 1);
		// System.out.println(s0.getArea());

		Shape s1, s2;
		s1 = new Circle(1, 1, 2);
		s2 = new Rect(2, 2, 3, 4);

		System.out.println(s1.getArea());

		String m1 = s1.toString();
		System.out.println(m1);
		System.out.println("Area of s1 = " + s1.getArea());
		System.out.println(s2.toString());
		System.out.println("Area of s2 = " + s2.getArea());

		Shape[] s = new Shape[4];

		s[0] = new Circle(1, 1, 1);
		s[1] = new Circle(2, 1, 2);
		s[2] = new Rect(1, 0, 4, 4);
		s[3] = new Rect(1, 0, 2, 4);

		for (var v: s) {
			System.out.println(v.getArea());
		}
	}
	
}