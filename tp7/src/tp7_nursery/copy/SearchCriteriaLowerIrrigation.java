package tp7_nursery.copy;

public class SearchCriteriaLowerIrrigation extends SearchCriteria {
	private int searchValue;
	
	public SearchCriteriaLowerIrrigation(int searchValue) {
		this.searchValue = searchValue;
	}

	@Override
	public boolean meetsCondition(Plant plant) {
		return  plant.getIrrigation() < this.searchValue ;
	}

}
