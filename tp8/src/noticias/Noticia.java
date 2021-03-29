package noticias;

import java.util.ArrayList;

public class Noticia extends Contenido {

	

	private String titulo;
	private ArrayList<String> palabrasClaves;
	private String introduccion;
	private String texto;
	private String autor;
	private String link;

	public Noticia(String titulo, String autor, String introduccion) {
		this.titulo = titulo;
		this.autor = autor;
		this.introduccion = introduccion;
		this.palabrasClaves = new ArrayList<>();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public ArrayList<String> getPalabrasClaves() {
		return new ArrayList<>(palabrasClaves);
	}

	public void setPalabrasClaves(ArrayList<String> palabrasClaves) {
		this.palabrasClaves = new ArrayList<>(palabrasClaves);
	}

	public void addPlabraClave(String palabraClave) {
		this.palabrasClaves.add(palabraClave);
	}
	
	public String getIntroduccion() {
		return introduccion;
	}

	public void setIntroduccion(String introduccion) {
		this.introduccion = introduccion;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Override
	public int cantidadNoticias() {
		return 1;
	}

	@Override
	public Contenido copiar(Busqueda busqueda) {
		if (busqueda.cumple(this)) {
			Noticia copiaNoticia = new Noticia(this.titulo,this.autor,this.introduccion);
			copiaNoticia.setTexto(this.getTexto());
			copiaNoticia.setLink(this.getLink());
			copiaNoticia.setPalabrasClaves(this.getPalabrasClaves());
			return copiaNoticia;
		} else {
			return null;
		}
	}

	@Override
	public Contenido copiar() {
		Noticia copiaNoticia = new Noticia(this.titulo,this.autor,this.introduccion);
		copiaNoticia.setTexto(this.getTexto());
		copiaNoticia.setLink(this.getLink());
		copiaNoticia.setPalabrasClaves(this.getPalabrasClaves());
		return copiaNoticia;
	}
	
}
