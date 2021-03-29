package noticias;

public class Main {

	public static void main(String[] args) {

		Seccion raiz = new Seccion("raiz","-");
		
		Seccion s1 = new Seccion("s1","-");
		Seccion s2 = new Seccion("s2","-");
		
		Seccion s1a = new Seccion("s1a","-");
		Seccion s1b = new Seccion("s1b","-");
		
		Noticia noticia = new Noticia("titulo","autor","intro");
		noticia.addPlabraClave("mascota");
		
		raiz.addContenido(s1);
		raiz.addContenido(s2);
		
		s1.addContenido(s1a);
		s1.addContenido(s1b);

		s2.addContenido(noticia);
		
		Contenido copia = raiz.copiar();
		
		System.out.println(copia.toString());
		
	}

}
