package dcel;

public class Point {
	
	
	/**
	 * A point has two coordinates, x & y, both double for precision
	 */
	private final double x;
	private final double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	/**
	 * Calculate the Euclidean Distance between this point and another(that) point
	 * @param that: the other point
	 * @return Euclidian distance between this and that
	 */
	public double distanceTo(Point that){
		return Math.sqrt(Math.pow((this.getX() - that.getX()), 2) + Math.pow((this.getY() - that.getY()), 2));
	}
}
