package tp7_library;

import java.util.Comparator;

public class ComparatorAutor implements Comparator<Book> {

	public ComparatorAutor() {
		
	}

	@Override
	public int compare(Book b1, Book b2) {		
		return b1.getAutor().compareTo(b2.getAutor());
	}

}
