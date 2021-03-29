package tp7_nursery.copy;


public class SearchCriteriaCommonName extends SearchCriteria {
	private String searchedCommonName;
	
	public SearchCriteriaCommonName(String searchedCommonName) {
		super();
		this.searchedCommonName = searchedCommonName.toLowerCase();
	}

	@Override
	public boolean meetsCondition(Plant plant) {		
		return plant.containsCommonName(this.searchedCommonName);
	}

}
