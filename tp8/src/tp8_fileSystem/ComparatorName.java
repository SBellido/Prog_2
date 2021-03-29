package tp8_fileSystem;

import java.util.Comparator;

public class ComparatorName implements Comparator<ElementFileSystem> {

	@Override
	public int compare(ElementFileSystem elem1, ElementFileSystem elem2) {
		String name1 = elem1.getName();
		String name2 = elem2.getName();
		return name1.compareTo(name2);
	}

}
