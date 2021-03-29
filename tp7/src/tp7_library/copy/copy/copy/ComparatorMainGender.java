package tp7_library.copy.copy.copy;

import java.util.Comparator;

public class ComparatorMainGender implements Comparator<Book>{

	public ComparatorMainGender() {
		
	}

	@Override
	public int compare(Book b1, Book b2) {		
		String g1 = b1.getGenders().get(0);
		String g2 = b2.getGenders().get(0);
		return g1.compareTo(g2);
	}

}
