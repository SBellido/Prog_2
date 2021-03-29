package tp7_nursery.copy;

public class SearchCriteriaGreaterIrrigation extends SearchCriteria {
	private int searchValue;
	
	public SearchCriteriaGreaterIrrigation(int searchValue) {
		this.searchValue = searchValue;
	}

	@Override
	public boolean meetsCondition(Plant plant) {
		return plant.getIrrigation() > this.searchValue;
	}

}
