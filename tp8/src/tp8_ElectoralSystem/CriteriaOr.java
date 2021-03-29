package tp8_ElectoralSystem;

public class CriteriaOr extends Criteria {
	Criteria criteria1, criteria2;
	
	public CriteriaOr(Criteria criteria1, Criteria criteria2) {
		this.criteria1 = criteria1;
		this.criteria2 = criteria2;
	}

	@Override
	public boolean meetsCondition(Vote vote) {
		return (this.criteria1.meetsCondition(vote) ||
				this.criteria2.meetsCondition(vote));
		
	}

}
