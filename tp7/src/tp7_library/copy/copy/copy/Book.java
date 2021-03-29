package tp7_library.copy.copy.copy;

import java.util.ArrayList;
import java.util.List;

public class Book implements Comparable<Book> {
	private String isbn;
	private String title;
	private String autor;
	private int year;
	private List<String> genders;

	public Book(String isbn, String autor, int year) {
		this.isbn = isbn;	
		this.autor = autor;
		this.year = year;
		this.genders = new ArrayList<>();
	}

	
	
//	AGREGA GÉNERO
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
			return (this.getAutor().equals(aux.getAutor()) &&
					this.genders.containsAll(aux.genders) &&
					this.getTitle().equals(aux.getTitle()));
		} catch (Exception e) {
			return false;
		}
	}

	
	@Override
	public String toString() {
		return "\n----------------------------------" +
				"\nLibro ISBN = " + this.getIsbn() + 
				"\nAutor: " + this.getAutor() +
				"\nAño: " + this.getYear();
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
	public String getTitle() {
		return title;
	}
	public List<String> getGenders() {
		return new ArrayList<>(this.genders);
	}
	

}
