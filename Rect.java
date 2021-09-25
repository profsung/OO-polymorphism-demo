public class Rect extends Shape {

	int width;
	int height;

	public Rect(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	public double getArea() {
		return width * height;
	}

	public String toString() {
		return "Rect[" + getX() + ", " + getY() + "] w=" + width + " h="+height;
	}
	
}
