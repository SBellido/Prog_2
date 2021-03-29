package tp6_PersonaContract.copy;

public class CriteriaAnd extends Criteria {
	private Criteria firstCriteria;
	private Criteria secondCriteria;
	
	public CriteriaAnd(Criteria firstCriteria, Criteria secondCriteria ) {
		this.firstCriteria = firstCriteria;
		this.secondCriteria = secondCriteria;
	}

	@Override
	public boolean acceptContract(Candidate candidate) {
		return (this.firstCriteria.acceptContract(candidate) &&
				this.secondCriteria.acceptContract(candidate));
	}
	
	
// GETTERS Y SETTERS
	public Criteria getFirstCriteria() {
		return firstCriteria;
	}

	public void setOne(Criteria firstCriteria) {
		this.firstCriteria = firstCriteria;
	}

	public Criteria getSecondCriteria() {
		return secondCriteria;
	}

	public void setTwo(Criteria secondCriteria) {
		this.secondCriteria = secondCriteria;
	}

	

	
}
