package tp8_fileSystem;

import java.util.Comparator;

public class ComparatorInverse implements Comparator<ElementFileSystem> {
	private Comparator<ElementFileSystem> comparator;
	
	public ComparatorInverse(Comparator<ElementFileSystem> comparator) {
		this.comparator = comparator;
	}

	@Override
	public int compare(ElementFileSystem elem1, ElementFileSystem elem2) {
		return - this.compare(elem1, elem2);
	}

}
