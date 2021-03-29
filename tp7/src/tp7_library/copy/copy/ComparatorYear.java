package tp7_library.copy.copy;

import java.util.Comparator;

public class ComparatorYear implements Comparator<Book>{

	public ComparatorYear() {
		
	}

	@Override
	public int compare(Book b1, Book b2) {		
		return b1.getYear() - b2.getYear();
	}

}
