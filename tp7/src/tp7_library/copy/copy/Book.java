package tp7_library.copy.copy;

import java.util.ArrayList;
import java.util.List;

public class Book implements Comparable<Book> {
	private String isbn;
	private String autor;
	private int year;
	private List<String> genders;

	public Book(String isbn, String autor, int year) {
		this.isbn = isbn;	
		this.autor = autor;
		this.year = year;
		this.genders = new ArrayList<>();
	}

	
	
//	AGREGA G�NERO
	public void addGender(String gender) {
		if (!containGender(gender)) {
			this.genders.add(gender);
		}
	}
	private boolean containGender(String gender) {
		return this.genders.contains(gender);
	}
	@Override
	public int compareTo(Book book) {		
		return this.getIsbn().compareTo(book.getIsbn());
	}
	
	@Override
	public boolean equals(Object obj) {
		try {
			Book aux = (Book) obj;
			return this.getIsbn().equals(aux.getIsbn());
		} catch (Exception e) {
			return false;
		}
	}

	
	@Override
	public String toString() {
		return "\n----------------------------------" +
				"\nLibro ISBN = " + this.getIsbn() + 
				"\nAutor: " + this.getAutor() +
				"\nA�o: " + this.getYear() + 
				"\nG�neros: " + this.getGenders();
	}

//	GETTERS & SETTERS
	public int getYear() {
		return year;
	}
	public String getIsbn() {
		return isbn;
	}
	public String getAutor() {
		return autor;
	}
	public List<String> getGenders() {
		return new ArrayList<>(this.genders);
	}


}
