package tp6_PersonaContract.copy;

public class CriteriaContractHour extends Criteria {
	private int weeklyHours;
	
	public CriteriaContractHour(int weeklyHours) {
		this.weeklyHours = weeklyHours;
	}

	@Override
	public boolean acceptContract(Candidate candidate) {		
		return candidate.getWeeklyHours() == this.getWeeklyHours();
	}
	
	public int getWeeklyHours() {
		return this.weeklyHours;
	}

}
