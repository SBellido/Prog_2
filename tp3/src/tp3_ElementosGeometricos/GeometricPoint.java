package tp3_ElementosGeometricos;

public class GeometricPoint {
	final static int powTwo = 2;
	private int x;
	private int y;

	public GeometricPoint() {
		this.x = 0;
		this.y = 0;
	}

	public GeometricPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int calculateDistanceY(GeometricPoint point) {
		if (this.getY() > point.getY()) {
			return this.getY() - point.getY();
		} else {
			return point.getY() - this.getY();
		}
	}
	
	public int calculateDistanceX(GeometricPoint point) {		
		if (this.getX() > point.getX()) {
			return this.getX() - point.getX();
		} else {
			return point.getX() - this.getX();
		}
	}
	
	public void shiftPoint(int x, int y) {
		int newX = this.getX() + x;
		int newY = this.getY() + y;
		this.setX(newX);
		this.setY(newY);
	}

	public double calculateEuclideanDistance(int x2, int y2) {
		int x1 = this.getX();
		int y1 = this.getY();
		double FirstValue = Math.pow((x1 - x2), powTwo);
		double SecondValue = Math.pow((y1 - y2), powTwo);	
		double euclideanDistance = Math.sqrt(FirstValue + SecondValue);
		return euclideanDistance;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "\n-------------------"+
				"\nPunto geométrico: "+"\nX: "+ this.getX() + "\nY: "+ this.getY() +
				"\n-------------------";
	}

	
}
