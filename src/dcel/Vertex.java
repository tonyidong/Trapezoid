package dcel;

public class Vertex {
	
	private Point point;
	private int id;

	public Vertex(Point point, int id) {
		// TODO Auto-generated constructor stub
		this.point = point;
		this.id = id;
	}
	
	/**
	 * Get the vertex's position as a point object
	 * @return Point object that represents the location of this vertex
	 */
	public Point getPoint(){
		return point;
	}
	
	/**
	 * Get the ID of this vertex
	 * @return an integer value of this vertex's ID
	 */
	public int getID(){
		return id;
	}
	
	
	/**
	 * Four methods that returns the horizontal or vertical distance between two points,
	 * the parameter can be another vertex or just another point
	 */
	public double horizontalDistance(Vertex that){
		return this.getPoint().getX() - that.getPoint().getX();
	}
	
	public double horizontalDistance(Point p){
		return this.getPoint().getX() - p.getX();
	}

	public double verticalDistance(Vertex that){
		return this.getPoint().getY() - that.getPoint().getY();
	}
	
	public double verticalDistance(Point p){
		return this.getPoint().getY() - p.getY();
	}
	
	
	/**
	 * Get the Euclidean distance to another point or vertex
	 * @param that
	 * @return
	 */
	public double distanceTo(Vertex that){
		return this.getPoint().distanceTo(that.getPoint());
	}
	
	public double distanceTo(Point p){
		return this.getPoint().distanceTo(p);
	}
	
}
