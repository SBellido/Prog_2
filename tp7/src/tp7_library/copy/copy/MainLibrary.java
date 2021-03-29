package tp7_library.copy.copy;
/* 3 – Biblioteca
Una biblioteca posee un sistema para la administración de libros disponibles para sus socios.
El sistema debe permitir ordenar el conjunto de todos los libros disponibles por diferentes
criterios, acorde a lo que desee buscar en un determinado momento. Por defecto, los libros se
ordenan por ISBN, un código identificatorio único de cada libro. Sin embargo, es posible que
el administrador de la biblioteca desee ordenarlos por autor, año de edición o género
principal, tanto ascendente como descendentemente. Resolver el problema utilizando el
método sort(.), de la clase Collections.
*/
public class MainLibrary {
	
	public static void main(String[] args) {
		Book book0 = new Book("A32", "Edgar Alam Poe", 1950);
		Book book1 = new Book("A45", "Alejandro Dolina", 1998);
		Book book2 = new Book("A00", "Miguel De Cervantes", 1845);
		Book book3 = new Book("B10", "Jorge Luis Borges", 1960);
		Book book4 = new Book("B01", "Julio Verne", 1744);
		Book book5 = new Book("b01", "Julio Cortazar", 1987);
		Book book6 = new Book("c50", "Mario de Benedetti", 1970);
		Book book7 = new Book("C49", "Gabrial García Marquez", 1996);
		Book book8 = new Book("C", "Paulo Cohelo", 2010);
		
		Library library = new Library();
		book0.addGender("Fantasía");
		book0.addGender("Infantil");
		book1.addGender("Humor");
		book1.addGender("Sátira");
		book2.addGender("Terror");
		book2.addGender("Suspenso");
		book3.addGender("Documental");
		book3.addGender("Historia");
		book4.addGender("Suspenso");
		book4.addGender("Drama");
		book5.addGender("Drama");
		book5.addGender("Policial");
		book6.addGender("Policial");
		book6.addGender("Thriller");
		book7.addGender("Ficción");
		book7.addGender("Infantil");
		book8.addGender("Anime");
		book8.addGender("Adultos");
		
		library.addBook(book0);
		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		library.addBook(book4);
		library.addBook(book5);
		library.addBook(book6);
		library.addBook(book7);
		library.addBook(book8);
		
//		System.out.println(library.getBooks());
//		System.out.println(library.getBooksReverse());
//		System.out.println(library.getBooksAutorReverse());
//		System.out.println(library.getBooksYear());
//		System.out.println(library.getBooksYearReverse());
//		System.out.println(library.getBooksGender());
		System.out.println(library.getBooksAutor());
	
	}
		

}


