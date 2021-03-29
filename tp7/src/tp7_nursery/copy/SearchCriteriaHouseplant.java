package tp7_nursery.copy;

public class SearchCriteriaHouseplant extends SearchCriteria {
	
	public SearchCriteriaHouseplant() {

	}

	@Override
	public boolean meetsCondition(Plant plant) {
		return plant.isHouseplant();
	}

}
