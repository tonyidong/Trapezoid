package dcel;

import java.util.ArrayList;

public class Face {
	
	private ArrayList<HalfEdge> innerHalfEdges;
	private boolean isOuter;
	private int id;
	private HalfEdge leadEdge;
	

	public Face(int id) {
		this.id = id;
		this.isOuter = false;
		this.innerHalfEdges = new ArrayList<HalfEdge>();
	}
	
	public Face(int id, HalfEdge leadEdge){
		this(id);
		this.leadEdge = leadEdge;
		innerHalfEdges.add(leadEdge);
	}

	public ArrayList<HalfEdge> getInnerHalfEdges() {
		return innerHalfEdges;
	}

	public void setInnerHalfEdges(ArrayList<HalfEdge> innerHalfEdges) {
		this.innerHalfEdges = innerHalfEdges;
	}

	public boolean isOuter() {
		return isOuter;
	}

	public void setOuter(boolean isOuter) {
		this.isOuter = isOuter;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public HalfEdge getLeadEdge() {
		return leadEdge;
	}

	public void setLeadEdge(HalfEdge leadEdge) {
		this.leadEdge = leadEdge;
	}
	
	
	
	

}
