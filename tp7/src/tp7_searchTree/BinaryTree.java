package tp7_searchTree;


public class BinaryTree {
	private Node nodeRoot;
	
	public BinaryTree() {}
	public BinaryTree(Node nodeRoot) {
		this.nodeRoot = nodeRoot;
	}

	public void ejecutar(AccionEjecutable accionEjecutable) {	
		if (this.nodeRoot != null)
			this.nodeRoot.ejecutar(accionEjecutable);
	}
	
	public void addNode(Node newNode) {
		if (this.getRoot() == null)
			this.setNodeRoot(newNode);
		else  this.nodeRoot.addNode(newNode);
	}
	
//	CONFIGURA NODO RAÍZ
	private void setNodeRoot(Node nodeRoot) {
		this.setRoot(nodeRoot);
		nodeRoot.setFather(null);
	}

	
	
	@Override
	public String toString() {
		return "ÁRBOL BINARIO" + this.getRoot();
	}

	private Node getRoot() {
		return this.nodeRoot;
	}
	public void setRoot(Node nodeRoot) {
		this.nodeRoot = nodeRoot;
	}
	

}
