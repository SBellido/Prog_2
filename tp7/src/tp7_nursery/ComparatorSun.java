package tp7_nursery;

import java.util.Comparator;

public class ComparatorSun implements Comparator<Plant> {
	
	public ComparatorSun() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Plant plant1, Plant plant2) {
		return plant1.getSun() - plant2.getSun();
		
	}

}
