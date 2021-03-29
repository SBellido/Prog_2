package tp7_searchTree;
/*
5 - �?rbol binario de búsqueda
Un árbol binario es una estructura de datos formada por nodos que contienen un determinado valor. 
El primer elemento agregado a la estructura se conoce con el nombre de “raíz�? y es el único punto de acceso a la
misma. Cada nodo, puede tener un nodo “hijo�? a su izquierda y un nodo hijo a su derecha cumpliendo con la
restricción que los valores a su izquierda son valores menores que su propio valor, y los
valores a su derecha son valores mayores (no se almacenan valores repetidos). 

Los nodos sin hijos se conocen como “hojas�?. Normalmente, para facilitar el recorrido de la estructura, cada
nodo tiene una referencia a su nodo “padre�?.

A. Implementar la funcionalidad para agregar un nuevo objeto a la estructura. Para poder
trabajar con cualquier objeto es necesario que el mismo pueda ser comparable, es
decir, implementar la interfaz Comparable de Java.

B. Implementar un método que permita recorrer la estructura en orden, es decir, todos los
elementos a la izquierda, luego la raíz y después todos los elementos a la derecha. Al
recorrer los elementos es necesario que se defina una acción la cual se va a ejecutar.

Para poder trabajar de forma transparente y que se pueda extender la funcionalidad
definir una interfaz AccionEjecutable. La misma posee un método public void
ejecutarNodo(Object nodo). 

Una posible implementación sería:

public class ImprimirEnPantalla implements AccionEjecutable {
	public void ejecutarNodo(Object nodo) {
	System.out.println(nodo.toString());
	}
}

�? Crear una acción que permita incorporar los elementos de forma ordenada
ascendentemente a un Vector.

�? Crear una acción que permita incorporar los elementos de forma ordenada
descendentemente a un Vector.

�? Crear una acción que cuente la cantidad de elementos visitados.

 */
public class MainSearchTree {

	public static void main(String[] args) {
		Node node1 = new Node(50);
		Node node2 = new Node(20);
		Node node3 = new Node(10);
		Node node4 = new Node(5);
		Node node5 = new Node(100);
		Node node6 = new Node(40);
		Node node7 = new Node(70);
		BinaryTree tree = new BinaryTree();
		AddNodeAscendente a = new AddNodeAscendente();
		AddNodeDescendente d = new AddNodeDescendente();
		ContarNodos c = new ContarNodos();
		tree.addNode(node1);
 		tree.addNode(node4);
		tree.addNode(node5);
		tree.addNode(node6);
		tree.addNode(node3);
		tree.addNode(node7);
		tree.addNode(node2);
//		System.out.println(tree);
		
		tree.ejecutar(a);
		tree.ejecutar(d);
		tree.ejecutar(c);
		System.out.println(a.getNodes());
		System.out.println(d.getNodes());
		System.out.println(c.getCount());

	}

}
