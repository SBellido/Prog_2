package tp6_PersonaContract.copy;

public class CriteriaDifferentCompany extends Criteria {
	private String company;
	
	public CriteriaDifferentCompany(String company) {
		this.company = company;
	}

	@Override
	public boolean acceptContract(Candidate candidate) {
		return candidate.getCompany() != this.getCompany();
	}

	public String getCompany() {
		return company;
	}

	
	
}
