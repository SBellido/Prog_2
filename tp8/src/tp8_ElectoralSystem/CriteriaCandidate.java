package tp8_ElectoralSystem;

public class CriteriaCandidate extends Criteria {
	private Candidate candidate;
	
	public CriteriaCandidate(Candidate candidate) {
		this.candidate = candidate;
 	}

	@Override
	public boolean meetsCondition(Vote vote) {
		return vote.getCandidate().equals(this.candidate);		
	}

}
