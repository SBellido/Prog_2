package tp3_ElementosGeometricos;

import java.util.ArrayList;

public class Rect {
	private final static int MINVALUE = 0;
	private ArrayList<GeometricPoint> vertices;
	private static int amountCreated = 0;

	public Rect(
			GeometricPoint point1, GeometricPoint point2, 
			GeometricPoint point3,  GeometricPoint point4
			) {
		this.vertices = new ArrayList<GeometricPoint>();
		this.drawRect(point1, point2, point3, point4);
	}

	public void drawRect(
			GeometricPoint point1, GeometricPoint point2, 
			GeometricPoint point3, GeometricPoint point4
			) {
		int x1 = point1.getX();
		int y1 = point1.getY();
		int x3 = point3.getX();
		int y3 = point3.getY();
		if(x1 >= MINVALUE && x3 >= MINVALUE && y1 >= MINVALUE && y3 >= MINVALUE) {
			if (this.vertices.isEmpty()) {
				point2.setX(x1);
				point2.setY(y3); 
				point4.setX(x3);
				point4.setY(y1);
				this.vertices.add(point1);
				this.vertices.add(point2);
				this.vertices.add(point3);
				this.vertices.add(point4);
				amountCreated = getAmountCreated() + 1;
			}
		}
	}
	
	public void shiftRect(int x, int y) {
		for (GeometricPoint geometricPoint : this.vertices) {
			geometricPoint.shiftPoint(x, y);
		}
	}

	
	public int calculateHeight() {
		int height = 0;
		int x1, x2;
		for (int i = 0; i < this.vertices.size(); i++) {
			x1 = this.vertices.get(i).getX();
			x2 = this.vertices.get(i + 1).getX();
			if (x1 == x2) {
				height = this.vertices.get(i).calculateDistanceY(this.vertices.get(i + 1));
				break;
			}		
		}
		return height;
	}
	
	public int calculateBase() {
		int base = 0;
		int y1, y2;
		for (int i = 0; i < this.vertices.size(); i++) {
			y1 = this.vertices.get(i).getY();
			y2 = this.vertices.get(i + 1).getY();
			if (y1 == y2) {
				base = this.vertices.get(i).calculateDistanceX(this.vertices.get(i + 1));
				break;
			}
		}
		return base;
	}
	
	public double calculateArea() {
		int base = this.calculateBase();
		int height = this.calculateHeight();
		double area = base * height;	 
		return area;	
	}

	public int isBigger(Rect rect) {
		int result = 0;
		if (rect != null) {
			if (this.calculateArea() > rect.calculateArea()) {
				result = 1;
			} else if (this.calculateArea() < rect.calculateArea()) {
				result = -1;
			} else {
				result = 0;
			}
		}
		return result;
	}
	
	public boolean isSquare() {
		return this.calculateBase() == this.calculateHeight();
	}
	
	public boolean isHorizontal() {
		return this.calculateBase() > this.calculateHeight();
	}
	
	public int topSideLength() {
		int side = 0;
		for (int i = 0; i < this.vertices.size(); i++) {
			int y1 = this.vertices.get(i + 1).getY();
			int y2 = this.vertices.get(i + 2).getY();
			if (y1 == y2) {
				GeometricPoint point = this.vertices.get(i + 2);
				side = this.vertices.get(i + 1).calculateDistanceX(point);
				break;
			} 	
		}
		return side;
	}

	@Override
	public String toString() {
		return "Rectángulo:\n" + this.getVertices();
	}

	public ArrayList<GeometricPoint> getVertices() {
		return new ArrayList<GeometricPoint>(vertices);
	}

	public static int getAmountCreated() {
		return amountCreated;
	}

}
