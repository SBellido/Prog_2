package tp7_library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
	private  List<Book> books;
	
	public Library() {
		this.books = new ArrayList<>();
	}
	
	
	
// 	OBTIENE LIBROS ORDENADOS POR ISBN ASCENDENTE POR DEFECTO
	public List<Book> getBooks() {
		List<Book> orderedList = this.getOrder();
		return orderedList;
	}
//	ORDENA POR ISBN
	private List<Book> getOrder() {
		List<Book> copy = new ArrayList<>(this.books);
		Collections.sort(copy);
		return copy;
	}
// 	OBTIENE LIBROS ORDENADOS POR ISBN DESCENDENTE
	public List<Book> getBooksReverse() {
		List<Book> orderedList = this.getOrder();
		Collections.reverse(orderedList);
		return orderedList;
	}

	

// 	OBTIENE LIBROS ORDENADOS POR AUTOR ASCENDENTE
	public List<Book> getBooksAutor() {
		List<Book> orderedList = this.orderAutor();
		return orderedList;
	}
//	ORDENA POR AUTOR
	private List<Book> orderAutor() {
		List<Book> copy = new ArrayList<>(this.books);
		Collections.sort(copy, new ComparatorAutor());
		return copy;
	}
// 	OBTIENE LIBROS ORDENADOS POR AUTOR DESCENDENTE
	public List<Book> getBooksAutorReverse() {
		List<Book> orderedList = this.orderAutor();
		Collections.reverse(orderedList);
		return orderedList;
	}
	
	
	
// 	OBTIENE LIBROS ORDENADOS POR AÑO
	public List<Book> getBooksYear() {
		List<Book> orderedList = this.orderYear();
		Collections.sort(orderedList, new ComparatorYear());
		return orderedList;
	}	
//	ORDENA POR AÑO
	private List<Book> orderYear() {
		List<Book> copy = new ArrayList<>(this.books);
		Collections.sort(copy, new ComparatorYear());
		return copy;
	}	
// 	OBTIENE LIBROS ORDENADOS POR AÑO
	public List<Book> getBooksYearReverse() {
		List<Book> orderedList = this.orderYear();
		Collections.reverse(orderedList);
		return orderedList;
	}
	
	
	
// 	OBTIENE LIBROS ORDENADOS POR GÉNERO PRINCIPAL
	public List<Book> getBooksGender() {
		List<Book> orderList = this.orderGender();
		return orderList;
	}
//	ORDENA POR AÑO
	private List<Book> orderGender() {
		List<Book> copy = new ArrayList<>(this.books);
		Collections.sort(copy, new ComparatorMainGender());
		return copy;
	}
// 	OBTIENE LIBROS ORDENADOS POR GÉNERO PRINCIPAL DESCENDENTE
	public List<Book> getBooksGenderReverse() {
		List<Book> orderList = this.orderGender();
		Collections.reverse(orderList);
		return orderList;
	}


	
//	AGREGA LIBRO, SI YA EXISTE LO REEMPLAZA
	public void addBook(Book book) { 
		if (!containsBook(book)) {
			this.books.add(book);
		} else {
			this.replaceBook(book);
		}
	}
//	REEMPLAZA LIBRO
	private void replaceBook(Book newBook) {
		for (Book book : this.books) {
			if (book.equals(newBook)) {
				book = (Book) newBook; 
// 	preguntar casting y si este método tiene sentido
			}
		}
	}
	
	private boolean containsBook(Book book) {
		return this.books.contains(book);
	}
	
	
	@Override
	public String toString() {
		return "\nBiblioteca: " + this.getBooks();
	}
	

}
