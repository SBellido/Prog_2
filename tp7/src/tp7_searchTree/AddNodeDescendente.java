package tp7_searchTree;

import java.util.ArrayList;
import java.util.List;

public class AddNodeDescendente implements AccionEjecutable {
	
	private List<Node> nodes;

	public AddNodeDescendente() {
		this.nodes = new ArrayList<>();
	}

	@Override
	public void ejecutarNodo(Node nodo) {
		this.nodes.add(0, nodo);
	}

	public List<Node> getNodes() {
		return new ArrayList<>(this.nodes);
	}

	
}
