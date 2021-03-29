package tp8_ElectoralSystem;

public class CriteriaNot extends Criteria {
	Criteria criteria;
	
	public CriteriaNot(Criteria criteria) {
		this.criteria = criteria;
	}

	@Override
	public boolean meetsCondition(Vote vote) {
		return !this.criteria.meetsCondition(vote);
		
	}

}
