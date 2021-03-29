package noticias;

public abstract class Contenido {

	public abstract int cantidadNoticias();
	
	public abstract Contenido copiar(Busqueda busqueda);

	public abstract Contenido copiar();
	
}
