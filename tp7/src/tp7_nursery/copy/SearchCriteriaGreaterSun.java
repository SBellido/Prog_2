package tp7_nursery.copy;

public class SearchCriteriaGreaterSun extends SearchCriteria {
	private int searchValue;
	
	public SearchCriteriaGreaterSun(int searchValue) {
		this.searchValue = searchValue;
	}

	@Override
	public boolean meetsCondition(Plant plant) {
		return plant.getSun() > this.searchValue;
	}

}
