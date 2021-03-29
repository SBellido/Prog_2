package tp6_PersonaContract.copy;

public class CriteriaContractExclusive extends Criteria {

	public CriteriaContractExclusive() { }

	@Override
	public boolean acceptContract(Candidate candidate) {		
		return candidate.getCompany() == null;
	}

}
