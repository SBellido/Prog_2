 package tp7_nursery.copy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NurseryAdmin {
	private List<Plant> plants;
	
	public NurseryAdmin() {
		this.plants = new ArrayList<>();		
	}	
	
//	RETORNA LISTA ORDENADA DE LA BÚSQUEDA
	public List<Plant> orderlySearch(SearchCriteria criteria, Comparator<Plant> comparatorPlant) {
		List<Plant> plantsFound = new ArrayList<>();
		plantsFound.addAll(getPlantsForCriteria(criteria, comparatorPlant));
		Collections.sort(plantsFound, comparatorPlant);
		return plantsFound;
	}
	
//	ORDENA PLANTAS, CAMBIA COMPARATOR EN TIEMPO DE EJECUCIÓN
	public List<Plant> orderPlants(Comparator<Plant> comparatorPlant) {
		List<Plant> copy = this.getPlants();
		Collections.sort(copy, comparatorPlant);
		return copy;
	}

//	OBTIENE LAS PLANTAS CON EL NOMBRE BUSCADO, CAMBIA CRITERIO EN TIEMPO DE EJECUCIÓN
	public List<Plant> getPlantsForCriteria(SearchCriteria criteria, Comparator<Plant> comparatorPlant) {
		List<Plant> plantsFound = new ArrayList<>();
		for (Plant plant : this.plants) {
			if (criteria.meetsCondition(plant)) {
				plantsFound.add(plant);
			}
		}
		this.orderPlants(comparatorPlant);
		return plantsFound;
	}
	
//	AGREGAR PLANTA
	public void addPlant(Plant plant) {
		if (!containsPlant(plant)) {
			this.plants.add(plant);
		}
	}
	private boolean containsPlant(Plant plant) {
		return this.plants.contains(plant);
	}

	
	@Override
	public String toString() {
		return "VIVERO" + 
				"\nLista de plantas: " + this.getPlants();
	}


	
// GETTERS & SETTERS
	public List<Plant> getPlants() {
		return new ArrayList<>(this.plants);
	}

	
	
	
}
