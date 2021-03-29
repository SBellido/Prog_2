package tp7_searchTree;

public class ContarNodos implements AccionEjecutable {
	private int count;
	
	public ContarNodos() {
		this.count = 0;
	}
	
	@Override
	public void ejecutarNodo(Node nodo) {
		count++;
		
	}

	public int getCount() {
		return count;
	}
	
	

}
