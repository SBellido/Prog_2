package tp7_nursery.copy;

import java.util.Comparator;

public class ComparatorNot implements Comparator<Plant> {
	private Comparator<Plant> comparator;
	
	public ComparatorNot(Comparator<Plant> comparator) {
		this.comparator = comparator;
	}

	@Override
	public int compare(Plant plant1, Plant plant2) {
		return - this.comparator.compare(plant1, plant2);
	}

}
