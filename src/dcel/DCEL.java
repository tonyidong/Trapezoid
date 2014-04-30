package dcel;

import java.util.ArrayList;

public class DCEL {
	
	private ArrayList<Face> faceList;
	private ArrayList<Vertex> vertexList;
	private ArrayList<HalfEdge> halfEdgeList;

	public DCEL() {
		this.faceList = new ArrayList<Face>();
		this.vertexList = new ArrayList<Vertex>();
		this.halfEdgeList = new ArrayList<HalfEdge>();
	}

	public ArrayList<Face> getFaceList() {
		return faceList;
	}

	public void setFaceList(ArrayList<Face> faceList) {
		this.faceList = faceList;
	}

	public ArrayList<Vertex> getVertexList() {
		return vertexList;
	}

	public void setVertexList(ArrayList<Vertex> vertexList) {
		this.vertexList = vertexList;
	}

	public ArrayList<HalfEdge> getHalfEdgeList() {
		return halfEdgeList;
	}

	public void setHalfEdgeList(ArrayList<HalfEdge> halfEdgeList) {
		this.halfEdgeList = halfEdgeList;
	}
	
	/**
	 * Add a new Vertex to the list
	 * @param p
	 */
	//What about associate it with it's everything......
	public void addVertex(Point p){
		for(int i = 0; i < this.vertexList.size(); i++){
			if(vertexList.get(i).distanceTo(p) == 0){
				return;
			}
		}
		
		vertexList.add(new Vertex(p, vertexList.size()));
	}
	
	public void addVertex(Vertex v){
		vertexList.add(v);
	}
	
	public void addHalfEdge(HalfEdge e){
		this.halfEdgeList.add(e);
	}
	
	public void addHalfEdge(int id){
		this.halfEdgeList.add(new HalfEdge(id));
	}
	
	public void addFace(Face f){
		this.faceList.add(f);
	}
	
	public void addFace(int id){
		Face f = new Face(id);
		if(id == 0){
			f.setOuter(true);
		}
		this.faceList.add(f);
	}
	

}
