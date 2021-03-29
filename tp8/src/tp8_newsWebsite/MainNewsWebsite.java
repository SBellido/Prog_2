package tp8_newsWebsite;
/*
 package tp8_newsWebsite;
/*4. Sitio Web de Noticias
Se desea modelar un administrador de contenidos de un sitio web de noticias. Los contenidos
del sitio están agrupados en categorías y dentro de cada categoría se dividen en secciones.
Asimismo, es posible que una sección se sub-divida nuevamente en otras sub secciones, y así
sucesivamente. Cada categoría, posee una descripción y una imagen asociada, lo mismo para
las secciones.

Una noticia puede estar asociada a una categoría, sección o sub-sección, posee un título, un
listado de palabras claves, una introducción, el texto, el autor, y un link asociado.
El modelo presentado debe proveer servicios que permitan obtener la cantidad de noticias que
contiene una categoría, y la cantidad de noticias que contiene una sección, sub-sección, etc.
Se debe proveer un mecanismo mediante el cual el administrador de contenidos pueda
restringirse a un tópico determinado, es decir ingresando una palabra clave se genera una
nueva interfaz en donde sólo las noticias que contienen esta palabra clave se muestran (es
importante que se respete la organización de las mismas, es decir categoría, sección,
sub-sección y así sucesivamente).

La nueva estructura obtenida es una copia de la existente, si se introduce un cambio en esta,
el mismo NO se refleja en la estructura original.
Adicionalmente se debe proveer servicios que permitan la búsqueda de noticias, por
ejemplo:
1. Buscar todas las noticias donde el largo del texto sea superior a 200.
2. Buscar todas las noticias del autor “Juan Pérez”.
3. Buscar todas las noticias que posean la palabra clave “Partido” y la palabra Clave
“Goleada”.
4. Buscar las noticias que el título sea “Ultimo momento”.

Los anteriores son sólo algunos ejemplos de búsqueda. Los distintos tipos de búsqueda
también pueden combinarse.

Debido a la dinamicidad del sitio (se crean constantemente nuevas categorías, secciones,
sub-secciones) es necesario proveer un mecanismo que permita armar el mapa del sitio, es
decir, obtener un listado de los distintos niveles del sitio y los links asociados a cada una de 
las noticias, por ejemplo a partir del contenido del sitio actual obtener una lista de la siguiente forma:

Generales
Generales\Espectáculos
Generales\Espectáculos\Link 1
Generales\Espectáculos\Divorcios
Generales\Espectáculos\Divorcios\Link 2
Generales\Espectáculos\Divorcios\Link 3
Generales\Deportes
Generales\Deportes\Fútbol
Generales\Deportes\Fútbol\Link 4
Generales\Deportes\Link 5
Generales\Link 6

Solo se devuelven los nombres de las categorías/secciones y en el caso de las noticias el link
asociado. La lista resultado concatena la información de manera tal de contar con el path de
la estructura.

En el ejemplo anterior, el Link5 está dentro de la sección “Deportes”, la cual está dentro de
la categoría “Generales”.
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
		

		News news1 = new News("Este es el título1", "Este es el link1");
		News news2 = new News("Este es el título2", "Este es el link2");
		News news3 = new News("Este es el título3", "Este es el link3");
		News news4 = new News("Este es el título3", "Este es el link4");
		
		news1.addKeyWord("perro");
		news1.addKeyWord("gato");
		news1.addKeyWord("chorro");
		news1.addKeyWord("reloj");
		news1.setLink("Link noticia1");
		news2.addKeyWord("perro");
		news2.addKeyWord("hola");
		news2.addKeyWord("pepe");
		news2.addKeyWord("tablón");
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
