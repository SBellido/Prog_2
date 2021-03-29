package tp7_searchTree;

import java.util.ArrayList;
import java.util.List;

public class AddNodeAscendente implements AccionEjecutable {
	List<Node> nodes;
	
	public AddNodeAscendente() {
		this.nodes = new ArrayList<>();
	}

	@Override
	public void ejecutarNodo(Node nodo) {
		this.nodes.add(nodo);
	}

	public List<Node> getNodes() {
		return new ArrayList<>(this.nodes);
	}

	
}
