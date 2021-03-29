package tp7_nursery.copy;

public class SearchCriteriaLowerSun extends SearchCriteria {
	private int searchValue;
	
	public SearchCriteriaLowerSun(int searchValue) {
		this.searchValue = searchValue;
	}

	@Override
	public boolean meetsCondition(Plant plant) {
		return  plant.getSun() < this.searchValue ;
	}

}
