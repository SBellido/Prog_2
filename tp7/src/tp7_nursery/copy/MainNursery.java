package tp7_nursery.copy;

import java.util.Comparator;

/*
 * 4 - Vivero
Un vivero necesita un sistema que le permita cargar fichas de las diferentes plantas que
vende. Cada planta posee un nombre científico, una lista de nombres vulgares, una
clasificación superior, una familia y una clase. Las plantas pueden prosperar mejor en interior
o en exterior, tienen un requerimiento de sol que se indica con un número entero del 1 al 10
(1 para sombra, hasta 10 para sol pleno) y un requerimiento de agua que se indica de la
misma manera (1 para riesgo escaso y 10 para riego abundante).
Por ejemplo:
Nombre Científico: Epipremnum aureum
Nombres vulgares: potus, pothos o potos
Clasificación superior: Epipremnum
Familia: Araceae
Clase: Monocotyledoneae
Planta de interior
Riego: 3
Sol: 4
El sistema debe ser útil para los administradores del vivero para, por ejemplo, cuando llega
un cliente poder ofrecerle las plantas que cumplen con sus requerimientos:
a) Todas las plantas cuyo nombre científico incluya la palabra “auereum”
b) Todas las plantas a las que se conozca vulgarmente como “lengua de suegra”
c) Todas las plantas cuya clasificación sea “Crassula”
d) Todas las plantas que requieran un nivel de sol superior a 5 y riego inferior a 3
e) Todas las plantas que requieran un nivel de sol inferior a 4 y riego superior a 4
f) Todas las plantas de interior que necesiten poco riego (inferior a 3)
g) Cualquier combinación lógica de las formas anteriores
Los listados anteriores deben retornarse ordenados por el criterio de preferencia de cada
cliente. Por ejemplo, un cliente puede estar interesado en “crassulas”, ordenadas por el nivel
de sol requerido (primero las que requieran más sol), y si hay varias que requieren el mismo
nivel de sol, las que requieran menos agua deben mostrarse primero y, finalmente, por orden
alfabético del nombre vulgar. El cliente puede proporcionar un criterio de orden (ascendente
o descendente) de cualquiera de los atributos que se guardan de las plantas.
 */
public class MainNursery {

	public static void main(String[] args) {
		NurseryAdmin nurseryAdmin = new NurseryAdmin();
		Plant plant1 = new Plant("Opipremnum aureum", "Apipremnum", "Uraceae", "Eonocotyledoneae", true, 5, 10);
		Plant plant2 = new Plant("Ipip remnum aureum", "Epipremnum", "Oraceae", "Ionocotyledoneae", false, 12, 30);
		Plant plant3 = new Plant("Apipremnum aureum", "Ipipremnum", "Iraceae", "Eonocotyledoneae", false, 2, 5);
		Plant plant4 = new Plant("Epipremnum aureum", "Opipremnum", "Eraceae", "Uonocotyledoneae", true, 30, 2);
		Plant plant5 = new Plant("Epipremnum aureum", "Upipremnum", "Araceae", "Aonocotyledoneae", false, 10, 15);
//		
//		Comparator<Plant> comparator1 = new ComparatorIrrigation();
//		Comparator<Plant> comparator2 = new ComparatorSun();
		Comparator<Plant> comparator3 = new ComparatorCommonName();
		Comparator<Plant> comparator4 = new ComparatorNot(comparator3);
//		
//		SearchCriteria criteria1 = new SearchCriteriaCommonName("Lengua de suegra");
//		SearchCriteria criteria2 = new SearchCriteriaScientificname("Epipremnum");
//		SearchCriteria criteria3 = new SearchCriteriaClassName("Eonocotyledoneae");
//		SearchCriteria criteria4 = new SearchCriteriaGreaterSun(10);
		SearchCriteria criteria5 = new SearchCriteriaGreaterIrrigation(10);
		
		plant1.addCommonName("lengua de suegra");
		plant1.addCommonName("jazmin");
		plant1.addCommonName("florecita");
		plant1.addCommonName("flor naranja");
		plant2.addCommonName("lengua de suegra");
		plant2.addCommonName("jazmin");
		plant3.addCommonName("florecita");
		plant3.addCommonName("florecita");
		plant4.addCommonName("jazmin");
		plant4.addCommonName("flor naranja");
		plant5.addCommonName("florecita");
		plant5.addCommonName("lengua de suegra");
		
		nurseryAdmin.addPlant(plant1);
		nurseryAdmin.addPlant(plant3);
		nurseryAdmin.addPlant(plant1);
		nurseryAdmin.addPlant(plant2);
		nurseryAdmin.addPlant(plant5);
		nurseryAdmin.addPlant(plant4);
		
		comparator3.reversed();
		
		System.out.println(nurseryAdmin.orderlySearch(criteria5, comparator3));
//		System.out.println(nurseryAdmin.orderPlantsReverse());
	
	}

}
