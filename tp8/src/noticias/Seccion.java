package noticias;

import java.util.ArrayList;

public class Seccion extends Contenido {

	private String nombre;
	private String descripcion;
	private String imagenAsociada;
	
	private ArrayList<Contenido> contenidos;
	
	public Seccion(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.contenidos = new ArrayList<>();
	}
	
	public void addContenido(Contenido contenido) {
		this.contenidos.add(contenido);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagenAsociada() {
		return imagenAsociada;
	}

	public void setImagenAsociada(String imagenAsociada) {
		this.imagenAsociada = imagenAsociada;
	}
	
	@Override
	public int cantidadNoticias() {
		int totalNoticias = 0;
		
		for (Contenido contenido: this.contenidos)
			totalNoticias += contenido.cantidadNoticias();
		
		return totalNoticias;
	}

	@Override
	public Contenido copiar(Busqueda busqueda) {
		Seccion copiaSeccion = new Seccion(this.nombre, this.descripcion);
		copiaSeccion.setImagenAsociada(this.getImagenAsociada());
				
		for (Contenido contenido: this.contenidos) {
			Contenido contenidoCopia = contenido.copiar(busqueda);
			if (contenidoCopia != null)
				copiaSeccion.addContenido(contenidoCopia);
		}
		
		return copiaSeccion;
	}

	@Override
	public Contenido copiar() {
		Seccion copiaPropia = new Seccion(this.nombre, this.descripcion);
		copiaPropia.setImagenAsociada(this.getImagenAsociada());
				
		for (Contenido contenido: this.contenidos) {
			Contenido hijoCopiado = contenido.copiar();
			copiaPropia.addContenido(hijoCopiado);
		}
		
		return copiaPropia;
	}

	@Override
	public String toString() {
		return "Seccion [nombre=" + nombre + "]";
	}
		
}
