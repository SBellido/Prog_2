package tp7_nursery.copy;

public class SearchCriteriaScientificname extends SearchCriteria{
	private String scientificName;
	
	public SearchCriteriaScientificname(String scientificName) {
		this.scientificName = scientificName;
	}

	@Override
	public boolean meetsCondition(Plant plant) {
		return plant.searchName(this.scientificName);
	}

}
