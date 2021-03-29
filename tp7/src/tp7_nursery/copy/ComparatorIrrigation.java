package tp7_nursery.copy;

import java.util.Comparator;

public class ComparatorIrrigation implements Comparator<Plant> {

	public ComparatorIrrigation() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Plant plant1, Plant plant2) {
		return plant1.getIrrigation() - plant2.getIrrigation();
	}

}
