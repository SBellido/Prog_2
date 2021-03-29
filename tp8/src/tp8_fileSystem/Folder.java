package tp8_fileSystem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Folder extends ElementFileSystem {
	private List<ElementFileSystem> content;
	
	public Folder(String name) {
		super(name);
		this.content = new ArrayList<>();
	}

	public void addElement(ElementFileSystem element) {
		if (!containsElement(element)) {
			this.content.add(element);
			element.setFather(this);			
		}
	}
	
	public boolean containsElement(ElementFileSystem searchedElement) {
		if (searchedElement.equals(this)) 
			return true;
		else {
			for (ElementFileSystem element : this.content) {
				if (element.containsElement(searchedElement)) 
					return true;
			}
			return false;
		}	
	}
	
	@Override
	public double getSize() {
		double totalSize = 0;
		for (ElementFileSystem element : this.content) {
			totalSize += element.getSize();
		}
		return totalSize;
	}

	@Override
	public List<ElementFileSystem> search(Comparator<ElementFileSystem> comparator, Criteria criteria) {
		List<ElementFileSystem> found = new ArrayList<>();
		if (criteria.meetsCondition(this))
			found.add(this);
		for (ElementFileSystem elem : this.content) {
			found.addAll(elem.search(comparator, criteria));
		}
		return found;
	}

	@Override
	public String toString() {
		return super.toString() + "/";
	}

	
	
}
