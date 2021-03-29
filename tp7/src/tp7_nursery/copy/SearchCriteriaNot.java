package tp7_nursery.copy;

public class SearchCriteriaNot extends SearchCriteria {
	SearchCriteria criteria;
	
	public SearchCriteriaNot(SearchCriteria criteria) {
		this.criteria = criteria;
	}

	@Override
	public boolean meetsCondition(Plant plant) {	
		return !this.criteria.meetsCondition(plant);
	}   

}
