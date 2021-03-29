package tp8_newsWebsite;
/*
 package tp8_newsWebsite;
/*4. Sitio Web de Noticias
Se desea modelar un administrador de contenidos de un sitio web de noticias. Los contenidos
del sitio est�n agrupados en categor�as y dentro de cada categor�a se dividen en secciones.
Asimismo, es posible que una secci�n se sub-divida nuevamente en otras sub secciones, y as�
sucesivamente. Cada categor�a, posee una descripci�n y una imagen asociada, lo mismo para
las secciones.

Una noticia puede estar asociada a una categor�a, secci�n o sub-secci�n, posee un t�tulo, un
listado de palabras claves, una introducci�n, el texto, el autor, y un link asociado.
El modelo presentado debe proveer servicios que permitan obtener la cantidad de noticias que
contiene una categor�a, y la cantidad de noticias que contiene una secci�n, sub-secci�n, etc.
Se debe proveer un mecanismo mediante el cual el administrador de contenidos pueda
restringirse a un t�pico determinado, es decir ingresando una palabra clave se genera una
nueva interfaz en donde s�lo las noticias que contienen esta palabra clave se muestran (es
importante que se respete la organizaci�n de las mismas, es decir categor�a, secci�n,
sub-secci�n y as� sucesivamente).

La nueva estructura obtenida es una copia de la existente, si se introduce un cambio en esta,
el mismo NO se refleja en la estructura original.
Adicionalmente se debe proveer servicios que permitan la b�squeda de noticias, por
ejemplo:
1. Buscar todas las noticias donde el largo del texto sea superior a 200.
2. Buscar todas las noticias del autor �Juan P�rez�.
3. Buscar todas las noticias que posean la palabra clave �Partido� y la palabra Clave
�Goleada�.
4. Buscar las noticias que el t�tulo sea �Ultimo momento�.

Los anteriores son s�lo algunos ejemplos de b�squeda. Los distintos tipos de b�squeda
tambi�n pueden combinarse.

Debido a la dinamicidad del sitio (se crean constantemente nuevas categor�as, secciones,
sub-secciones) es necesario proveer un mecanismo que permita armar el mapa del sitio, es
decir, obtener un listado de los distintos niveles del sitio y los links asociados a cada una de 
las noticias, por ejemplo a partir del contenido del sitio actual obtener una lista de la siguiente forma:

Generales
Generales\Espect�culos
Generales\Espect�culos\Link 1
Generales\Espect�culos\Divorcios
Generales\Espect�culos\Divorcios\Link 2
Generales\Espect�culos\Divorcios\Link 3
Generales\Deportes
Generales\Deportes\F�tbol
Generales\Deportes\F�tbol\Link 4
Generales\Deportes\Link 5
Generales\Link 6

Solo se devuelven los nombres de las categor�as/secciones y en el caso de las noticias el link
asociado. La lista resultado concatena la informaci�n de manera tal de contar con el path de
la estructura.

En el ejemplo anterior, el Link5 est� dentro de la secci�n �Deportes�, la cual est� dentro de
la categor�a �Generales�.
 */

public class MainNewsWebsite {

	public static void main(String[] args) {
		NewsWebsite newsWebsite = new NewsWebsite("Noticia digital");
		
		CompositeContent categoryFilm = new CompositeContent("categoryFilm");
		CompositeContent categorySport = new CompositeContent("categorySport");
		CompositeContent categoryTech = new CompositeContent("categoryTech");
		CompositeContent section1 = new CompositeContent("section1");
		CompositeContent section2 = new CompositeContent("section2");
		CompositeContent section3 = new CompositeContent("section3");
		CompositeContent subSection1 = new CompositeContent("subSection1");
		CompositeContent subSection2 = new CompositeContent("subSection2");
		CompositeContent subSection3 = new CompositeContent("subSection3");
	
//		CriteriaKeyWord criteriaKeyWord = new CriteriaKeyWord("perro");
		

		News news1 = new News("Este es el t�tulo1", "Este es el link1");
		News news2 = new News("Este es el t�tulo2", "Este es el link2");
		News news3 = new News("Este es el t�tulo3", "Este es el link3");
		News news4 = new News("Este es el t�tulo3", "Este es el link4");
		
		news1.addKeyWord("perro");
		news1.addKeyWord("gato");
		news1.addKeyWord("chorro");
		news1.addKeyWord("reloj");
		news1.setLink("Link noticia1");
		news2.addKeyWord("perro");
		news2.addKeyWord("hola");
		news2.addKeyWord("pepe");
		news2.addKeyWord("tabl�n");
		news2.setLink("Link noticia2");
		
		
		
		categoryFilm.addContent(section1);
		section1.addContent(subSection1);
		subSection1.addContent(news1);
		subSection1.addContent(news4);

		categorySport.addContent(section2);
		section2.addContent(subSection2);
		subSection2.addContent(news2);

		categoryTech.addContent(section3);
		section3.addContent(subSection3);
		subSection3.addContent(news3);
		
		newsWebsite.addContent(categoryFilm);
		newsWebsite.addContent(categorySport);
		newsWebsite.addContent(categoryTech);

//		System.out.println(subSection1.countNews());
//		System.out.println(subSection1.copy("perro"));
		
		System.out.println(categoryFilm.fullPath());
		System.out.println(categoryTech.copy("perro"));
	}



}
