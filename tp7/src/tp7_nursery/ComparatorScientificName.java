package tp7_nursery;

import java.util.Comparator;

public class ComparatorScientificName implements Comparator<Plant> {
	private  String scientificName;
	
	public ComparatorScientificName(String scientificName) {
		this.scientificName = scientificName;
	}

	@Override
	public int compare(Plant plant1, Plant plant2) {
		String namePlant1 = plant1.getScientificName();
		String namePlant4 = plant2.getScientificName();
		return namePlant1.compareTo(namePlant4);
	}

}
