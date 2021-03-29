package tp7_nursery.copy;

import java.util.Comparator;

public class ComparatorConcatenated implements Comparator<Plant>{
	Comparator<Plant> comparator1, comparator2;
	
	public ComparatorConcatenated(Comparator<Plant> comparator1, Comparator<Plant> comparator2) {
		this.comparator1 = comparator1;
		this.comparator2 = comparator2;
	}
	@Override
	public int compare(Plant plant1, Plant plant2) {
		int result = comparator1.compare(plant1, plant2);
		if (result == 0) {
			//comparetor2 es un ComparatorAnd
			result = comparator2.compare(plant1, plant2);
		}
		return result;
	}

}
