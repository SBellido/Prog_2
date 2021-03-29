package tp7_nursery.copy;


public class SearchCriteriaClassName extends SearchCriteria {
	private String searchClassName;
	
	public SearchCriteriaClassName(String searchClassName) {
		this.searchClassName = searchClassName.toLowerCase();
	}

	@Override
	public boolean meetsCondition(Plant plant) {
		return this.searchClassName.equals(plant.getClassPlant());
	}


}
