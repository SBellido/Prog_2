package tp7_nursery.copy;

public class SearchCriteriaOr extends SearchCriteria {
	SearchCriteria criteria1, criteria2;
	
	public SearchCriteriaOr(SearchCriteria criteria1, SearchCriteria criteria2) {
		this.criteria1 = criteria1;
		this.criteria2 = criteria2;
	}

	@Override
	public boolean meetsCondition(Plant plant) {
		return this.criteria1.meetsCondition(plant) || this.criteria2.meetsCondition(plant);
	}

}
