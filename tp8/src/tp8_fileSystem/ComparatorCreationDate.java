package tp8_fileSystem;

import java.time.LocalDate;
import java.util.Comparator;

public class ComparatorCreationDate implements Comparator<ElementFileSystem> {

	public ComparatorCreationDate() {
		
	}

	@Override
	public int compare(ElementFileSystem elem1, ElementFileSystem elem2) {
		LocalDate date1 = elem1.getCreationDate();
		LocalDate date2 = elem2.getCreationDate();
		return date1.compareTo(date2);
	}

}
