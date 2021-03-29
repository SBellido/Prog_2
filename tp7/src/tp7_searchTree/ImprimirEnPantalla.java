package tp7_searchTree;

public class ImprimirEnPantalla implements AccionEjecutable {
		
	
	public ImprimirEnPantalla() {
		
	}
	
	public void ejecutarNodo(Node nodo) {
		System.out.println(nodo.toString());
	}
}
