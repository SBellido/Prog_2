package tp3_ElementosGeometricos;

public class Rectangle {
	private GeometricPoint vertexOne;
	private GeometricPoint vertexTwo;
	private GeometricPoint vertexThree;
	private GeometricPoint vertexFour;

	public Rectangle(GeometricPoint vertexOne, GeometricPoint vertexThree) {
		this.vertexOne = vertexOne;
		this.vertexThree = vertexThree; 		
	}

	private GeometricPoint correctPointFour(GeometricPoint point) {
		int x = this.getVertexThree().getX();
		int y = this.getVertexOne().getY();
		point.setY(y);
		point.setX(x);
		return point;
	}
	
	private GeometricPoint correctPointTwo(GeometricPoint point) {
		int x = this.getVertexOne().getX();
		int y = this.getVertexThree().getY();
		point.setX(x);
		point.setY(y);
		return point;
	}
	
	
	@Override
	public String toString() {
		return "Rectangulo: \nVértice 1: " + this.getVertexOne()+ "\nVértice 2: " + this.getVertexTwo() + 
				"\nVértice 3: " + this.getVertexThree() + "\nVértice 4: "+ this.getVertexFour();
	}

	public GeometricPoint getVertexOne() {
		return vertexOne;
	}

	public GeometricPoint getVertexTwo() {
		return vertexTwo;
	}

	public void setVertexTwo(GeometricPoint vertexTwo) {		
		this.vertexTwo = this.correctPointTwo(vertexTwo);
	}

	public GeometricPoint getVertexThree() {
		return vertexThree;
	}

	public GeometricPoint getVertexFour() {
		return vertexFour;
	}

	public void setVertexFour(GeometricPoint vertexFour) {
		this.vertexFour = this.correctPointFour(vertexFour);
	}

}
