package tp7_searchTree;

public class Node implements Comparable<Node> {
	private Node minorSonLeft;
	private Node higherSonRight;
	private Node father;
	private Comparable value;
	
	public Node() {
	}

	public Node(int value) {
		this.value = value;
		this.minorSonLeft = null;
		this.higherSonRight = null;
		this.father = null;
	}

	public void ejecutar(AccionEjecutable accionEjecutable) {
		if (this.minorSonLeft != null) {
			this.minorSonLeft.ejecutar(accionEjecutable);			
		}
		accionEjecutable.ejecutarNodo(this);
		if (this.higherSonRight != null) {
			this.higherSonRight.ejecutar(accionEjecutable);			
		}
	}
	
	public void addNode(Node newNode) {
		int result = this.compareTo(newNode);
		if (result > 0) {
			if (this.getMinorSonLeft() != null) {
				this.minorSonLeft.addNode(newNode);
			} else {
				this.setMinorSonLeft(newNode);
				newNode.setFather(this);
			}
		} else if (result < 0) {
			if (this.getHigherSonRight() != null) {
				this.higherSonRight.addNode(newNode);
			} else {
				this.setHigherSonRight(newNode);
			}
		}
	}

	@Override
	public int compareTo(Node node) {
		return this.value.compareTo(node.getValue());
	}

	@Override
	public String toString() {
		return "\n-----------------------------" + 
				"\nNODO" + "\nValor: " + this.getValue();
	}

	@Override
	public boolean equals(Object obj) {
		try {
			Node aux = (Node) obj;
			return this.getValue() == aux.getValue();
		} catch (Exception e) {
			return false;
		}
	}

//	GETTERS & SETTERS
	public void setRootNode(Node rootNode) {
		this.setFather(null);
	}

	public Comparable getValue() {
		return this.value;
	}

	public void setValue(Comparable value) {
		this.value = value;
	}

	public Node getFather() {
		return father;
	}

	public void setFather(Node father) {
		this.father = father;
	}

	public Node getMinorSonLeft() {
		return minorSonLeft;
	}

	public void setMinorSonLeft(Node minorSonLeft) {
		this.minorSonLeft = minorSonLeft;
	}

	public Node getHigherSonRight() {
		return higherSonRight;
	}

	public void setHigherSonRight(Node higherSonRight) {
		this.higherSonRight = higherSonRight;
	}


}
