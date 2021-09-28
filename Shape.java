public class Shape {

	private int x;
	private int y;

	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double getArea() {
		return -1;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String say() {
		return "Hello";
	}

	public String say(int m) {
		return "Hello " + m;
	}

	public String say(double n) {
		return "Hello " + n;
	}
}