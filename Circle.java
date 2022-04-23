package lab1;

public class Circle implements IShape {
	private int radius;

	/**
	 * @param radius
	 */
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double area() {
		return this.radius * this.radius * Math.PI;
	}
	
	

}
