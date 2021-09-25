public class Circle  extends Shape {

	private int radius;

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

	public String toString() {
		return "Circle[" + getX() + ", " + getY() + "] r=" + radius;
	}
	
}
