package tp7_nursery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NurseryAdmin {
	private List<Plant> plants;
	private Comparator<Plant> comparatorPlant;
	private SearchCriteria criteria;
	public NurseryAdmin() {
		this.plants = new ArrayList<>();		
	}
	
	
//	ORDENA PLANTAS
	List<Plant> orderPlant(Comparator<Plant> comparatorPlant) {
		List<Plant> copy = this.getPlants();
		Collections.sort(copy, comparatorPlant);
		return copy;
	}
	
	
//	OBTIENE PLANTAS ORDENADAS POR NIVEL DE SOL
	public List<Plant> getPlantOrderSun() {
		this.setComparatorPlant(new ComparatorSun());
		List<Plant> orderList = this.orderPlant(comparatorPlant);
		return orderList;
	}
//	OBTIENE PLANTAS ORDENADAS POR NIVEL DE SOL DESCENDENTE
	public List<Plant> getPlantOrderSunReverse() {
		List<Plant> orderList = this.getPlantOrderSun();
		Collections.reverse(orderList);
		return orderList;
	}

	
//	OBTIENE PLANTAS ORDENADAS POR RIEGO
	public List<Plant> getPlantOrderIrrigation() {
		this.setComparatorPlant(new ComparatorIrrigation());
		List<Plant> orderList = this.orderPlant(comparatorPlant);
		return orderList;
	}
//	OBTIENE PLANTAS ORDENADAS POR RIEGO DESCENDENTE
	public List<Plant> getPlantOrderIrrigationReverse() {
		List<Plant> orderList = getPlantOrderIrrigation();
		Collections.reverse(orderList);
		return orderList;
	}
	
//	OBTIENE LAS PLANTAS CON EL NOMBRE BUSCADO
	public List<Plant> getPlantsForCriteriaWord(String searchedName) {
		List<Plant> plantsFound = new ArrayList<>();
		for (Plant plant : this.plants) {
			if (criteria.meetsCondition(plant)) {
				plantsFound.add(plant);
			}
		}
		return plants;
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


	public List<Plant> getPlants() {
		return new ArrayList<>(this.plants);
	}
 
	public void setComparatorPlant(Comparator<Plant> comparatorPlant) {
		this.comparatorPlant = comparatorPlant;
	}

// GETTERS & SETTERS
	
	
	
	
}
