package tp7_library.copy.copy.copy;

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

	
//	ORDENA LIBROS, CAMBIA COMPARATOR EN TIEMPO DE EJECUCIÓN
	public List<Book> orderBooks() {
		List<Book> copy = this.getBooks();
		Collections.sort(copy, comparatorBook);
		return copy;
	}

//	ORDENA LIBROS DESCENDENTE, CAMBIA COMPARATOR EN TIEMPO DE EJECUCIÓN
	public List<Book> orderBooksReverse() {
		List<Book> orderedList = orderBooks();
		Collections.reverse(orderedList);
		return orderedList;
	}	
	
	
// 	OBTIENE LIBROS ORDENADOS POR ISBN ASCENDENTE POR DEFECTO
	public List<Book> getBooks() {
		List<Book> copy = new ArrayList<>(this.books);
		Collections.sort(copy);
		return copy;
	}
// 	OBTIENE LIBROS ORDENADOS POR ISBN DESCENDENTE
	public List<Book> getBooksReverseISBN() {
		List<Book> orderedList = this.getBooks();
		Collections.reverse(orderedList);
		return orderedList;
	}
	
	
//	AGREGA LIBRO, SI YA EXISTE LO REEMPLAZA
	public void addBook(Book book) { 
		if (!containsBook(book))
			this.books.add(book);
		else this.replaceBook(book);	
	}
	
//	REEMPLAZA LIBRO
	private void replaceBook(Book newBook) {
		for (Book book : this.books) {
			if (book.equals(newBook))
				book = newBook; 
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
