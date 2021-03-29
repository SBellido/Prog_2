package tp8_fileSystem;

import java.time.LocalDate;
import java.util.Comparator;

public class ComparatorModificationDate implements Comparator<ElementFileSystem> {

	public ComparatorModificationDate() {
		
	}

	@Override
	public int compare(ElementFileSystem elem1, ElementFileSystem elem2) {
		LocalDate date1 = elem1.getModificationDate();
		LocalDate date2 = elem2.getModificationDate();
		return date1.compareTo(date2);
	}

}
