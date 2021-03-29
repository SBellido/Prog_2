package tp8_fileSystem;

import java.util.Comparator;

public class ComparatorConcatenated implements Comparator<ElementFileSystem> {
	Comparator<ElementFileSystem> comparator1, comparator2;
	
	public ComparatorConcatenated(Comparator<ElementFileSystem> comparator1, Comparator<ElementFileSystem> comparator2) {
		this.comparator1 = comparator1;
		this.comparator2 = comparator2;
	}

	@Override
	public int compare(ElementFileSystem elem1, ElementFileSystem elem2) {
		int result = this.comparator1.compare(elem1, elem2);
		if (result == 0) {
			result = comparator2.compare(elem1, elem2);
		}
		return result;
	}

}
