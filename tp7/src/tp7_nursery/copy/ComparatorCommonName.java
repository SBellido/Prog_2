package tp7_nursery.copy;

import java.util.Comparator;

public class ComparatorCommonName implements Comparator<Plant>{

	public ComparatorCommonName() {
		
	}

	@Override
	public int compare(Plant plant1, Plant plant2) {
		String CommonName1 = plant1.getCommonNames().get(0);
		String CommonName2 = plant2.getCommonNames().get(0);
		return CommonName1.compareTo(CommonName2);
	}

}
