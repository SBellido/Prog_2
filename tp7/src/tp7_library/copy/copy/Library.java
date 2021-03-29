package tp7_library.copy.copy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Library {
	private  List<Book> books;
	private Comparator<Book> comparatorBook;
	
	public Library() {
		this.books = new ArrayList<>();
	}

	
//	ORDENA LIBROS, CAMBIA COMPARATOR EN TIEMPO DE EJECUCI�N
	private List<Book> orderBooks(Comparator<Book> comparator) {
		List<Book> copy = this.getBooks();
		Collections.sort(copy, comparator);
		return copy;
	}
	
// 	OBTIENE LIBROS ORDENADOS POR AUTOR ASCENDENTE
	public List<Book> getBooksAutor() {	
		this.setComparatorBook(new ComparatorAutor());
		List<Book> orderedList = this.orderBooks(comparatorBook);
		return orderedList;
	}
// 	OBTIENE LIBROS ORDENADOS POR AUTOR DESCENDENTE
	public List<Book> getBooksAutorReverse() {
		List<Book> orderedList = getBooksAutor();
		Collections.reverse(orderedList);
		return orderedList;
	}	
	
	
// 	OBTIENE LIBROS ORDENADOS POR A�O
	public List<Book> getBooksYear() {
		this.setComparatorBook(new ComparatorYear());
		List<Book> orderedList = this.orderBooks(comparatorBook);
		return orderedList;
	}	
// 	OBTIENE LIBROS ORDENADOS POR A�O DESENDENTE
	public List<Book> getBooksYearReverse() {
		List<Book> orderedList = getBooksYear();
		Collections.reverse(orderedList);
		return orderedList;
	}
	
	
	
// 	OBTIENE LIBROS ORDENADOS POR G�NERO PRINCIPAL
	public List<Book> getBooksGender() {
		this.setComparatorBook(new ComparatorMainGender());
		List<Book> orderList = this.orderBooks(comparatorBook);
		return orderList;
	}
// 	OBTIENE LIBROS ORDENADOS POR G�NERO PRINCIPAL DESCENDENTE
	public List<Book> getBooksGenderReverse() {
		List<Book> orderList = this.getBooksGender(); 
		Collections.reverse(orderList);
		return orderList;
	}

	
	
// 	OBTIENE LIBROS ORDENADOS POR ISBN ASCENDENTE POR DEFECTO
	public List<Book> getBooks() {
		List<Book> copy = new ArrayList<>(this.books);
		Collections.sort(copy);
		return copy;
	}
// 	OBTIENE LIBROS ORDENADOS POR ISBN DESCENDENTE
	public List<Book> getBooksReverse() {
		List<Book> orderedList = this.getBooks();
		Collections.reverse(orderedList);
		return orderedList;
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
// 	preguntar casting y si este m�todo tiene sentido
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


	public void setComparatorBook(Comparator<Book> comparatorBook) {
		this.comparatorBook = comparatorBook;
	}



}
