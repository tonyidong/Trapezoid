package dcel;

public class HalfEdge {
	
	private Vertex origin;
	private HalfEdge prev, next, twin;
	private Face face;//Note: The left face
	private int id;
	

	public HalfEdge(Vertex origin, int id) {
		this.origin = origin;
		this.id = id;
	}
	
	public HalfEdge(int id){
		this.id = id;
	}


	public Vertex getOrigin() {
		return origin;
	}


	public void setOrigin(Vertex origin) {
		this.origin = origin;
	}


	public HalfEdge getPrev() {
		return prev;
	}


	public void setPrev(HalfEdge prev) {
		this.prev = prev;
	}


	public HalfEdge getNext() {
		return next;
	}


	public void setNext(HalfEdge next) {
		this.next = next;
	}


	public HalfEdge getTwin() {
		return twin;
	}


	public void setTwin(HalfEdge twin) {
		this.twin = twin;
	}


	public Face getFace() {
		return face;
	}


	public void setFace(Face face) {
		this.face = face;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	

}
