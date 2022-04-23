package lab1;

public class Rectangle implements IShape {
	private int width;
	private int height;
	/**
	 * @param width
	 * @param height
	 */
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	@Override
	public double area() {
		return this.width * this.height;
	}
	

}
