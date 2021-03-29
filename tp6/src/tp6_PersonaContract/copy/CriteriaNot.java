package tp6_PersonaContract.copy;

public class CriteriaNot extends Criteria {
	private Criteria criteria;
	
	public CriteriaNot(Criteria criteria) {
		this.criteria = criteria;
	}

	@Override
	public boolean acceptContract(Candidate candidate) {	
		return (!criteria.acceptContract(candidate));
	}

}
